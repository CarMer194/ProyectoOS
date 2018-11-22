/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoso;

import GUI.MenuPrincipal;
import GUI.Ventana;
import GUI.VistaFCFSdico;
import GUI.VistaMemoriaFIFO;
import GUI.VistaSSFDisco;
import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MenuPrincipal mp = new MenuPrincipal();
        VistaMemoriaFIFO fifo = new VistaMemoriaFIFO();
        VistaFCFSdico fcfs = new VistaFCFSdico();
        VistaSSFDisco ssf = new VistaSSFDisco();
        Ventana ventana = new Ventana("Menu principal",new Dimension(500,450), mp);
        while(true){
            if(mp.getOpcion()==3){
                    ventana.cambiarPanel("FIFO Memoria", new Dimension(900,600), fifo);
                    mp.setOpcion(0);
            }
            if(mp.getOpcion()==5){
                ventana.cambiarPanel("FCFS Disco", new Dimension(550,450), fcfs);
                mp.setOpcion(0);
            }
            if(mp.getOpcion()==6){
                ventana.cambiarPanel("SSF Disco", new Dimension(550,450), ssf);
                mp.setOpcion(0);
            }
            if(fifo.isAtras()){
                ventana.cambiarPanel("Menu principal", new Dimension(500,450), mp);
                fifo.setAtras(false);
                fifo=new VistaMemoriaFIFO();
            }
            if(fcfs.isAtras()){
                ventana.cambiarPanel("Menu principal", new Dimension(500,450), mp);
                fcfs.setAtras(false);
                fcfs = new VistaFCFSdico();
            }
            if(ssf.isAtras()){
                ventana.cambiarPanel("Menu principal", new Dimension(500,450), mp);
                ssf.setAtras(false);
                ssf=new VistaSSFDisco();
            }
            try {
                Thread.sleep(30);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
    }
    
}

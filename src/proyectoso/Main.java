/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoso;

import GUI.MenuPrincipal;
import GUI.Simulacion;
import GUI.Ventana;
import GUI.VistaFCFSdico;
import GUI.VistaMemoriaFIFO;
import GUI.VistaNFU;
import GUI.VistaSSFDisco;
import GUI.VistaTMCC;
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
        VistaTMCC tmcc = new VistaTMCC();
        MenuPrincipal mp = new MenuPrincipal();
        VistaMemoriaFIFO fifo = new VistaMemoriaFIFO();
        VistaFCFSdico fcfs = new VistaFCFSdico();
        VistaSSFDisco ssf = new VistaSSFDisco();
        VistaNFU nfu = new VistaNFU();
        Ventana ventana = new Ventana("Menu principal",new Dimension(500,450), mp);
        Simulacion loteria = new Simulacion();
        while(true){
            if(mp.getOpcion()==1){
                    ventana.cambiarPanel("Tiempo Más Corto a Continuación", new Dimension(650,450), tmcc);
                    mp.setOpcion(0);
            }
            if(mp.getOpcion()==2){
                    ventana.cambiarPanel("Calendarizacion por Loteria", new Dimension(650,450), loteria);
                    mp.setOpcion(0);
            }
            if(mp.getOpcion()==3){
                    ventana.cambiarPanel("FIFO Memoria", new Dimension(900,600), fifo);
                    mp.setOpcion(0);
            }
            if(mp.getOpcion()==5){
                ventana.cambiarPanel("FCFS Disco", new Dimension(900,600), fcfs);
                mp.setOpcion(0);
            }
            if(mp.getOpcion()==6){
                ventana.cambiarPanel("SSF Disco", new Dimension(550,450), ssf);
                mp.setOpcion(0);
            }
            if(mp.getOpcion()==4){
                nfu.setVisible(true);
                mp.setOpcion(0);
            }
            if(tmcc.isAtras()){
                ventana.cambiarPanel("Menu principal", new Dimension(500,450), mp);
                tmcc.setAtras(false);
                tmcc=new VistaTMCC();
            }
            if(loteria.isAtras()){
                ventana.cambiarPanel("Menu principal", new Dimension(500,450), mp);
                loteria.setAtras(false);
                loteria=new Simulacion();
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

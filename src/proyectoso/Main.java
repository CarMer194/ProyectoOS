/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoso;

import GUI.MenuPrincipal;
import GUI.Ventana;
import java.awt.Dimension;

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
        Ventana ventana = new Ventana("Menu principal",new Dimension(500,450), mp);
    }
    
}

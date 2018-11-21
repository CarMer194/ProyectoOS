/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Carlos
 */
public class Ventana extends javax.swing.JFrame{
    public Ventana(String title, Dimension size, JPanel view){
        super.setTitle(title);
        super.setSize(size);
        super.add(view);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
        super.setResizable(false);
    }
}

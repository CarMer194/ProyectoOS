/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoso;

import java.util.Stack;
import java.lang.Math.*;
import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class AlgoritmoSSF {

    int head;
    int desplazamiento;
    Stack<Integer> lista;
    Stack<Integer> des;

    public AlgoritmoSSF(int head, int desplazamiento) {
        this.head = head;
        this.desplazamiento = desplazamiento;
        lista = new Stack();
        des = new Stack();
    }

    public AlgoritmoSSF() {

    }

    public void add(int num) {
        lista.add(num);
    }

    void desplazamiento(Stack<Integer> lista, int head) {
        //desplazamiento: restar primera posición del stack menos head
        for (Integer i : lista) {
            des.push(Math.abs(i - head));
            //int a = Math.abs(i - head);
            System.out.println("Elementos: " + des);
        }

    }

    int min(Stack<Integer> lista) {
        int value = 0;
        for (Integer i : lista) {
            if (value < i) {
                value = i;
            }
        }
        return value;
    }

    public void buscar() {
        
    }
}

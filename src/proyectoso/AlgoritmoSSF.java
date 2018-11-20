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
    ArrayList<Integer> desplazamiento;
    boolean revisar = false;
    Stack<Integer> lista;

    public AlgoritmoSSF(int head, ArrayList<Integer> desplazamiento, Stack<Integer> lista) {
        this.head = head;
        lista = new Stack();
        desplazamiento = new ArrayList();
    }

    public  void add(int num) {
        lista.add(num);
    }

    void desplazamiento(Stack<Integer> list, int head) {
        //desplazamiento: restar primera posición del stack menos head
        //desplazamiento = Math.abs(list.peek() - head);
    }

    int min() {
        //encontrar minimo desplazamiento
        return 0;
    }
    
    public void buscar(){
        //luego de encontrar minimo desplazamiento, ubicar la posicion del stack (con min desplazamiento)
        //en la tabla graficamente, hacer que ese numero sea el nuevo head y luego sacarlo del stack
        //repetir desplazamiento, minimo y buscar hasta agotar stack
    }

    public static void main(String[] args) {
 
    }
}

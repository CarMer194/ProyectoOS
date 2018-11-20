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
    Stack <Integer> lista;
    Stack <Integer> des;

    public AlgoritmoSSF(int head, Stack<Integer> lista, Stack<Integer> des ) {
        this.head = head;
        lista = new Stack();
        des = new Stack();
    }
    
    public AlgoritmoSSF(){
        
    }

    public void add(int num) {
        lista.add(num);
    }

    void desplazamiento(Integer[] intArr, int head) {
        //desplazamiento: restar primera posición del stack menos head
        for(Integer i : intArr){
            des.push(Math.abs(i - head));
            //int a = Math.abs(i - head);
            System.out.println("Elementos: " + des);
        }

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
        AlgoritmoSSF f = new AlgoritmoSSF ();
        Integer[] intArr = {1001,1002,1003,1004};
        f.desplazamiento(intArr, 50);
    }
}

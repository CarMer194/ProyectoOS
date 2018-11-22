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

    public int head;
    public int desplazamiento;
    public Stack<Integer> lista;
    public Stack<Integer> des;
    public Stack<Integer> resultado;

    public AlgoritmoSSF(int head, int desplazamiento) {
        this.head = head;
        this.desplazamiento = desplazamiento;
        lista = new Stack<Integer>();
        des = new Stack<Integer>();
        resultado = new Stack<Integer>();
    }

    public AlgoritmoSSF() {
        lista = new Stack<Integer>();
        des = new Stack<Integer>();
        resultado = new Stack<Integer>();
    }

    public void add(int num) {
        lista.push(num);
    }

    public void desplazamiento(Stack<Integer> lista, int head) {
        for (Integer i : lista){
            des.push(Math.abs(i-head));
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

    public void buscar(Stack<Integer> lista, int head) {
        int recorrido = 0;
        for(int i = 0; i< lista.size(); i++){
            resultado.push(head);
            desplazamiento(lista,head);
            int index = min(des);
            recorrido += index;
            head = index;
            lista.pop();
        }
        //resultado
    }
}

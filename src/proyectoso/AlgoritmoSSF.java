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
    public int recorrido;
    public ArrayList<Integer> lista;
    public ArrayList<Integer> des;
    public ArrayList<Integer> resultado;

    public AlgoritmoSSF(int head, int desplazamiento) {
        this.head = head;
        this.desplazamiento = desplazamiento;
        lista = new ArrayList<Integer>();
        des = new ArrayList<Integer>();
        resultado = new ArrayList<Integer>();
    }

    public AlgoritmoSSF() {
        lista = new ArrayList<Integer>();
        des = new ArrayList<Integer>();
        resultado = new ArrayList<Integer>();
    }

    public void add(int num) {
        lista.add(num);
    }

    public void desplazamiento(ArrayList<Integer> lista, int head) {
        for (Integer i : lista){
            des.add(Math.abs(i-head));
            System.out.println("Resta: " + i + "-" + head);
        }
        System.out.println("Desplazamiento: " + des);
    }

    int min(ArrayList<Integer> lista) {
        int value = Integer.MAX_VALUE;
        for (int i = 0 ; i < lista.size(); i++) {
            if (value > lista.get(i)) {
                value = lista.get(i);
            }
        }
        return value;
    }

    public void buscar(ArrayList<Integer> lista, int head) {
        recorrido = 0;
        resultado.add(head);
        int a = lista.size();
        for(int i = 0; i< a; i++){
            desplazamiento(lista,head);
            int index = min(des);
            recorrido += index;
            System.out.println("Recorrido: " + recorrido);
            head = lista.get(des.indexOf(index));
            resultado.add(head);
            lista.remove(des.indexOf(index));
            des.clear();
        }
        System.out.println("Lista: " + resultado);
        System.out.println("Recorrido Total: " + recorrido);
    }
}

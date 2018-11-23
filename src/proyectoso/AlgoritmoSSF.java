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
    
    //Funcion que agrega elementos al ArrayList
    public void add(int num) {
        lista.add(num);
    }
    
    //Funcion que calcula el desplazamiento. Es decir,
    //Recorre toda la lista, y va restando el valor en la posición i
    //con la cabeza. Estos resultados se guardan en otro arreglo. 
    public void desplazamiento(ArrayList<Integer> lista, int head) {
        for (Integer i : lista){
            des.add(Math.abs(i-head));
            System.out.println("Resta: " + i + "-" + head);
        }
        System.out.println("Desplazamiento: " + des);
    }
    
    //Funcion que calcula el minimo valor del arreglo (agregado en la funcion desplazamiento).
    int min(ArrayList<Integer> lista) {
        int value = Integer.MAX_VALUE;
        for (int i = 0 ; i < lista.size(); i++) {
            if (value > lista.get(i)) {
                value = lista.get(i);
            }
        }
        return value;
    }
    //Funcion Principal: En la parte grafica, se van agregando las peticiones a un arreglo
    //Luego, ese arreglo se pasa como parametro, así como la posición inicial del brazo de disco
    //Se agrega la posición inicial a un nuevo arreglo, que será el que tendrá los elementos ordenados de acuerdo a SSF
    //Basicamente lo que hace la función es, calcular el desplazamiento 
    //Luego se calcula el valor minimo de ese desplazamiento
    //El valor minimo, es agregado a recorrido
    //La nueva cabeza, de la lista original, será la posición donde se encontró el valor minimo.
    //Ese valor de la nueva cabeza se agrega al arreglo final
    //Se elimina ese valor de la lista, ya que fue usado
    //Se borra toda la info de desplazamiento
    //Y así sucesivamente, hasta encontrar el SSF de el arreglo de las peticiones hechas.
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

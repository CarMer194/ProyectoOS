/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoso;

import java.util.Stack;
import java.util.HashMap;

/**
 *
 * @author Carlos
 */
public class AlgoritmoFifoMemoria {
    Stack<Integer> cola;
    HashMap <Integer,Integer> disco;
    HashMap <Integer,Boolean> bitM;
    int contador, contadorHash, heat, fallos;

    public AlgoritmoFifoMemoria() {
        cola= new Stack();
        disco= new HashMap<Integer,Integer>();
        bitM= new HashMap<Integer,Boolean>();
        contador=0;contadorHash=0;heat=0;fallos=0;
    }
    
    
    void AgregarElemento(Integer numero){
        if(cola.search(numero)==-1 && contador<4){
            cola.add(numero);
            disco.put(contadorHash, numero);
            bitM.put(numero, Boolean.FALSE);
            contador++;
            contadorHash++;
            fallos++;
        }
        else if(cola.search(numero)==-1 && contador==4){
            if(!disco.containsValue(numero)){
                disco.put(contadorHash, cola.pop());
                bitM.put(numero, Boolean.FALSE);
            }
            else{
                cola.pop();
            }
            cola.add(numero);
            contador++;
            contadorHash++;
            fallos++;
        }
        else{
            if(disco.containsValue(numero) && bitM.get(numero)==true ){
                bitM.replace(numero, Boolean.FALSE);
            }
            else{
                heat++;
            }
        }
    }
    
    void escritura(Integer num){
        bitM.replace(num, Boolean.TRUE);
    }
    
    void getPaginas(){
        
    }
    void getDisco(){
        
    }
    
}

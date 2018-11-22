/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoso;

import java.util.Stack;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Carlos
 */
public class AlgoritmoFifoMemoria {
    LinkedList<Integer> cola;
    HashMap <Integer,Integer> disco;
    HashMap <Integer,Boolean> bitM;
    int contador, contadorHash, heat, fallos,limite;

    public AlgoritmoFifoMemoria() {
        cola= new LinkedList();
        disco= new HashMap<Integer,Integer>();
        bitM= new HashMap<Integer,Boolean>();
        contador=0;contadorHash=0;heat=0;fallos=0;
    }
    
    
    public void agregarElemento(Integer numero){
        System.out.println("numero: "+numero);
        if(!cola.contains(numero) && contador<limite){
            cola.add(numero);
            if(!disco.containsValue(numero)){
                disco.put(contadorHash, numero);
                bitM.put(numero, Boolean.FALSE);
                contadorHash++;
                System.out.println("agrego hash");
            }
            contador++; 
            fallos++;
            System.out.println("Entro 1");
        }
        else if(!cola.contains(numero) && contador==limite){
            System.out.println("Entro 2");
            if(!disco.containsValue(numero)){
                disco.put(contadorHash, numero);
                bitM.put(numero, Boolean.FALSE);
            }
            cola.poll();
            cola.add(numero);
            //contador++;
            contadorHash++;
            fallos++;
        }
        else{
            System.out.println("Entro 3");
            if(disco.containsValue(numero) && bitM.get(numero)==true ){
                bitM.replace(numero, Boolean.FALSE);
                fallos++;
            }
            else{
                heat++;
            }
        }
    }
    
    public void escritura(Integer num){
        bitM.replace(num, Boolean.TRUE);
    }
    
    private void peticiones(Stack<String> tipo, Stack<Integer> num){
        while(!tipo.empty() && !num.empty() ){
            if(tipo.pop().equalsIgnoreCase("Lectura")){
                agregarElemento(num.pop());
            }
            if(tipo.pop().equalsIgnoreCase("Escritura")){
                escritura(num.pop());
            }
        }
    }
    
    Object getMemoria(){
        return new Object[]{};
    }
    
    
    Integer getDisco(int id){
        return disco.get(id);
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    
    public HashMap<Integer, Integer> getDisco() {
        return disco;
    }

    public LinkedList<Integer> getCola() {
        return cola;
    }

    public void setCola(LinkedList<Integer> cola) {
        this.cola = cola;
    }
    
    public void setDisco(HashMap<Integer, Integer> disco) {
        this.disco = disco;
    }

    public HashMap<Integer, Boolean> getBitM() {
        return bitM;
    }

    public void setBitM(HashMap<Integer, Boolean> bitM) {
        this.bitM = bitM;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getContadorHash() {
        return contadorHash;
    }

    public int getHeat() {
        return heat;
    }

    public int getFallos() {
        return fallos;
    }
    
    
}

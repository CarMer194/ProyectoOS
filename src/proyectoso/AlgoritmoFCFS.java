/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoso;
import java.util.Stack;
import java.lang.Math.*;
import java.util.LinkedList;
/**
 *
 * @author Carlos
 */
public class AlgoritmoFCFS {
    public LinkedList<Integer> cola;
    Integer posinicial, desplazamiento,desprom,desplaTiempo;
    
    public AlgoritmoFCFS(){
        cola=new LinkedList();
        posinicial=0;
        desprom=1;
        desplazamiento=0;
        desplaTiempo=1;
    }
   
    void agregarAcola(Integer numero){
        cola.add(numero);
        
    }
    
    public Integer calcularDesplazamiento(){
        int actual;
        while(!cola.isEmpty()){
            if(posinicial!=-1){
               desplazamiento=Math.abs(posinicial-cola.peek()); 
               System.out.println(desplazamiento+"   1");
            }
            actual=cola.poll();
            if(!cola.isEmpty())
            desplazamiento=Math.abs(actual-cola.peek())+desplazamiento;
            posinicial=-1;
            System.out.println(desplazamiento);
        }
        return desplazamiento; 
    }
    
    public Integer desplazamientoProm(){
        desprom=desplazamiento*desplaTiempo;
        return desprom;
    }

    public LinkedList<Integer> getCola() {
        return cola;
    }

    public void setCola(LinkedList<Integer> cola) {
        this.cola = cola;
    }

    

    public int getPosinicial() {
        return posinicial;
    }

    public void setPosinicial(Integer posinicial) {
        this.posinicial = posinicial;
    }

    public int getDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(Integer desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    public int getDesprom() {
        return desprom;
    }

    public void setDesprom(int desprom) {
        this.desprom = desprom;
    }

    public int getDesplaTiempo() {
        return desplaTiempo;
    }

    public void setDesplaTiempo(Integer desplaTiempo) {
        this.desplaTiempo = desplaTiempo;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoso;
import java.util.Stack;
import java.lang.Math.*;
/**
 *
 * @author Carlos
 */
public class AlgoritmoFCFS {
    Stack<Integer> cola;
    int posinicial, desplazamiento,desprom,desplaTiempo;

    public AlgoritmoFCFS(int posinicial, int desplazamiento, int desplaTiempo) {
        this.posinicial = posinicial;
        this.desplazamiento = desplazamiento;
        this.desplaTiempo = desplaTiempo;
        cola=new Stack();
    }
    
    void agregarAcola(Integer numero){
        cola.add(numero);
        
    }
    
    int calcularDesplazamiento(){
        desprom=Math.abs(desplazamiento - cola.pop());
        return desprom; 
    }
    
    void desplazamientoProm(){
        desprom=desprom/desplaTiempo;
    }

    public Stack<Integer> getCola() {
        return cola;
    }

    public void setCola(Stack<Integer> cola) {
        this.cola = cola;
    }

    public int getPosinicial() {
        return posinicial;
    }

    public void setPosinicial(int posinicial) {
        this.posinicial = posinicial;
    }

    public int getDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(int desplazamiento) {
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

    public void setDesplaTiempo(int desplaTiempo) {
        this.desplaTiempo = desplaTiempo;
    }
    
    
}

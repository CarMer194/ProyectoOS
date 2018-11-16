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
}

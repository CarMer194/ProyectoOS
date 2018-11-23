/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoso;

public class Proceso {
    public int aIdentificador;
    public int aNroPapeletas;
    protected float aTInicio;
    protected int aPrioridad;

    public Proceso(int aIdentificador, int aNroPapeletas,float  aTInicio){
        this.aIdentificador=aIdentificador;
        this.aNroPapeletas=aNroPapeletas;
        this.aTInicio = aTInicio;

    }

    public Proceso(int aTInicio){

    }


    public int getaIdentificador() {
        return aIdentificador;
    }

    public void setaIdentificador(int aIdentificador) {
        this.aIdentificador = aIdentificador;
    }

    public int getaNroPapeletas() {
        return aNroPapeletas;
    }

    public void setaNroPapeletas(int aNroPapeletas) {
        this.aNroPapeletas = aNroPapeletas;
    }

    public float getaTInicio() {
        return aTInicio;
    }

    public void setaTInicio(int aTInicio) {
        this.aTInicio = aTInicio;
    }
}
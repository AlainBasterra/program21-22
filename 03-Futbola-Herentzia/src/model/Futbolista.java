/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import enumak.Demarkazioa;

/**
 *
 * @author basterra.alain
 */
public class Futbolista extends IntegranteSeleccion {

    private int dorsal;
    private Demarkazioa demarcacion;

    public Futbolista(int dorsal, Demarkazioa demarcacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Demarkazioa getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(Demarkazioa demarcacion) {
        this.demarcacion = demarcacion;
    }


    public String entrenar() {
        return "entrenar";
    }

    public String jugarPartido() {
        return "jugarPartido";
    }

    @Override
    public String toString() {
        return "Futbolista{" + "Id=" + id + ", nombre=" + nombre + ", apellidos=" + this.getApellidos() +", edad=" + this.getEdad() +", dorsal=" + dorsal +", demarcacion=" + demarcacion + '}';
    }
    
}

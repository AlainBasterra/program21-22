/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author basterra.alain
 */
public class Entrenador extends IntegranteSeleccion {

    private String idFederacion;

    public Entrenador(){
        super();
    }
    
    
    public Entrenador(String idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public String dirigirEntrenamiento() {
        return "dirigirEntrenamiento";
    }

    public String dirigirPartido() {
        return "dirigirPartido";
    }

    @Override
    public String toString() {
        return "Entrenador{" + "idFederacion=" + idFederacion + '}';
    }

    
}

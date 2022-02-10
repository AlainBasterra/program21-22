/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author basterra.alain
 */
public class Erosketa {
    protected char[] kodea;
    protected LocalDate data;
    protected Bezeroa bezeroa;
    protected ArrayList<Produktua> produktuak = new ArrayList();
    protected ArrayList<Integer> unitateak = new ArrayList();
    protected double guztira;

    public Erosketa(char[] kodea, Bezeroa bezeroa, double guztira) {
        this.kodea = kodea;
        this.bezeroa = bezeroa;
        this.guztira = guztira;
    }



    @Override
    public String toString() {
        return "Erosketa{" + "kodea=" + kodea + ", bezeroa=" + bezeroa + ", guztira=" + guztira + '}';
    }

    @Override
    public String toStringLuzea() {
        return "Erosketa{" + "kodea=" + kodea + ", data=" + data + ", bezeroa=" + bezeroa + ", produktuak=" + produktuak + ", unitateak=" + unitateak + ", guztira=" + guztira + '}';
    }
    
    public guztiraEgiaztatu(){
    }

    


    
}

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

    public Erosketa(){
    }
    
    
    public Erosketa(String kodea, Bezeroa bezeroa, double guztira) {
        this.kodea = kodea.toCharArray();
        this.bezeroa = bezeroa;
        this.guztira = guztira;
    }

    public Erosketa(String kodea, LocalDate data, Bezeroa bezeroa, ArrayList<Produktua> produktuak, ArrayList<Integer> unitateak, double guztira) {
        this.kodea = kodea.toCharArray();
        this.data = data;
        this.bezeroa = bezeroa;
        this.guztira = guztira;
        this.unitateak = unitateak;
        this.produktuak = produktuak;
    }

    


    @Override
    public String toString() {
        return "Erosketa{" + "kodea=" + kodea + ", bezeroa=" + bezeroa + ", guztira=" + guztira + '}';
    }

    public String toStringLuzea() {
        return "Erosketa{" + "kodea=" + kodea + ", data=" + data + ", bezeroa=" + bezeroa + ", produktuak=" + produktuak + ", unitateak=" + unitateak + ", guztira=" + guztira + '}';
    }
    
    public boolean guztiraEgiaztatu(){
        return false;
        
    }

    
}

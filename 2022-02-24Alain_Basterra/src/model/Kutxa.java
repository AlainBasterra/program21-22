/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.lang.Math;
/**
 *
 * @author basterra.alain
 */
public class Kutxa extends Laukizuzena {

    private int altuera;

    public Kutxa(Puntua erpina, Puntua kontrakoErpina, int altuera) {
        super(erpina, kontrakoErpina);
        this.altuera = altuera;
    }

    public int getAltuera() {
        return altuera;
    }
    
    public boolean isHandiagoa(Kutxa besteKutxaBat){
        boolean handiagoa = false;
        int nireBolumena = Math.abs(getErpinBat().getX() - getKontrakoErpina().getX()) * Math.abs(getErpinBat().getY() - getKontrakoErpina().getY()) * Math.abs(altuera);
        int besteBolumena = Math.abs(besteKutxaBat.getErpinBat().getX() - besteKutxaBat.getKontrakoErpina().getX()) * Math.abs(besteKutxaBat.getErpinBat().getY() - getKontrakoErpina().getY()) * Math.abs(altuera);
        if (besteBolumena > nireBolumena){
            handiagoa = true;
        }
        return handiagoa;
    }
    
    public int getBolumena(){
        int bolumena = Math.abs(this.getErpinBat().getX() - this.getKontrakoErpina().getX()) * Math.abs(this.getErpinBat().getY() - this.getKontrakoErpina().getY()) * Math.abs(this.altuera);
        return bolumena;
    }
    
    public boolean isInside(Puntua puntua){
        if (puntua.getX() >= this.getErpinBat().getX() && puntua.getX() <= this.getKontrakoErpinBat().getX()){
            
        }
    }

    @Override
    public String toString() {
        return "(" + getErpinBat().getX() + ", " + getKontrakoErpina().getY() + "), " + altuera;
    }
    
    @Override
    public void marraztu(){
     //(26,24),5)
        System.out.println(this.toString() + ", kutxa GUI baten marraztua izan da.");;
    }
    
}

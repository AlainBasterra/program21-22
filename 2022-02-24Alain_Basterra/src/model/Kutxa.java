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
public class Kutxa extends Laukizuzena {

    private int altuera;

    public Kutxa(Puntua erpina, Puntua kontrakoErpina, int altuera) {
        super(erpina, kontrakoErpina);
        this.altuera = altuera;
    }

    public int getAltuera() {
        return altuera;
    }
    
//    public boolean isHandiagoa(Kutxa besteKutxaBat){
//        int nireBolumena = (erpinBat.getX() - kontrakoErpina.getX()) * (erpinBat.getY() - kontrakoErpina.getY()) * altuera;
//        int besteBolumena = (besteKutxaBat.erpinBat.getX() - besteKutxaBat.kontrakoErpina.getX()) * (besteKutxaBat.erpinBat.getY() - kontrakoErpina.getY()) * altuera;
//        
//    }

    @Override
    public String toString() {
        return "Kutxa{" + "altuera=" + altuera + '}';
    }
    
    public void marraztu(){
        
    }
    
}

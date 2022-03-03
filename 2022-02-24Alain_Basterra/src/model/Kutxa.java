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

    public boolean isHandiagoa(Kutxa besteKutxaBat) {
        boolean handiagoa = false;
        int nireBolumena = Math.abs(getErpinBat().getX() - getKontrakoErpina().getX()) * Math.abs(getErpinBat().getY() - getKontrakoErpina().getY()) * Math.abs(altuera);
        int besteBolumena = Math.abs(besteKutxaBat.getErpinBat().getX() - besteKutxaBat.getKontrakoErpina().getX()) * Math.abs(besteKutxaBat.getErpinBat().getY() - getKontrakoErpina().getY()) * Math.abs(altuera);
        if (besteBolumena > nireBolumena) {
            handiagoa = true;
        }
        return handiagoa;
    }

    public int getBolumena() {
        int bolumena = Math.abs(this.getErpinBat().getX() - this.getKontrakoErpina().getX()) * Math.abs(this.getErpinBat().getY() - this.getKontrakoErpina().getY()) * Math.abs(this.altuera);
        return bolumena;
    }

    public boolean isInside(Puntua puntua) {
        boolean barruan = false;

        //Puntua
        int X1 = puntua.getX();
        int Y1 = puntua.getY();

        //Ertzak
        int ertzX1 = this.getErpinBat().getX();
        int ertzY1 = this.getErpinBat().getY();
        int ertzX2 = this.getKontrakoErpina().getX();
        int ertzY2 = this.getKontrakoErpina().getY();
//        
//        boolean kasu1 = false; // +X eta +Y
//        boolean kasu2 = false; // -X eta +Y
//        boolean kasu3 = false; // -X eta -Y
//        boolean kasu4 = false; // +X eta +Y
//        
//        if (ertzX1 > ertzX2 && ertzY1 > ertzY2){ //↗
//            kasu1 = true;
//        } else if (ertzX1 < ertzX2 && ertzY1 > ertzY2){ //↖
//            kasu2 = true;
//        } else if (ertzX1 < ertzX2 && ertzY1 < ertzY2){ //↙
//            kasu3 = true;
//        } else if (ertzX1 > ertzX2 && ertzY1 < ertzY2){ //↘
//            kasu4 = true;
//        }

        if ((X1 >= ertzX1 && X1 <= ertzX2) && (Y1 >= ertzY1 && Y1 <= ertzY2)) {
            barruan = true;
        }
        return barruan;
    }

    public int[] getErtzenLuzera() {
        int[] ertzak = new int[3];
        ertzak[0] = Math.abs(this.getErpinBat().getX() - this.getKontrakoErpina().getX());
        ertzak[1] = Math.abs(this.getErpinBat().getY() - this.getKontrakoErpina().getY());
        ertzak[2] = this.getAltuera();
        return ertzak;
    }

    public Kutxa handiena(Kutxa[] kutxak) {
        int x = 0;
        int bolumena = kutxak[0].getBolumena();
        Kutxa handiena = kutxak[0];
        for (int i = 0; i < kutxak.length; i++) {
            if (kutxak[i].getBolumena() > bolumena){
                bolumena = kutxak[i].getBolumena();
                x = i;
            }            
        }        
        return kutxak[x];
    }

        @Override
        public String toString
        
            () {
        return "(" + getErpinBat().getX() + ", " + getKontrakoErpina().getY() + "), " + altuera;
        }

        @Override
        public void marraztu
        
            () {
        //(26,24),5)
        System.out.println(this.toString() + ", kutxa GUI baten marraztua izan da.");;
        }

    }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import model.*;

/**
 *
 * @author basterra.alain
 */
public class EpekakoErosketa {

    private int epeak = 12;
    private boolean ordainketaBukatuta = false;
    private double kuota;

    public EpekakoErosketa(String kodea, String data, Bezeroa eroslea, ArrayList<Produktua> produktuak, ArrayList<Integer> unitateak, double guztira, double kuota) {
        super {kodea, data, eroslea, produktuak, unitateak, guztira);
        this.kuota = kuota;
        }
        
        
    }
}

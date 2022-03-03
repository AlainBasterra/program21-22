/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author basterra.alain
 */
public class Puntua implements Marrazgarria {

    private int x;
    private int y;
    private static int sortutakoPuntuak = 0; //int aldagaien balio lehenetsia 0 da.

    public Puntua() {
        // x = 0
        // y = 0
        sortutakoPuntuak++;
    }

    public Puntua(int x, int y) {
        this.x = x;
        this.y = y;
        sortutakoPuntuak++;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static int getSortutakoPuntuak() {
        return sortutakoPuntuak;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isEzkerreragoThan(Puntua bestePuntuBat) {
        boolean ezkerrerago = false;
        if (this.x < bestePuntuBat.getX()) {
            ezkerrerago = true;
        }

        return ezkerrerago;

        //return this.x < bestePuntuBat.getX();
    }

    public Puntua mugitu(Puntua puntua) {
        System.out.println("Zer norabidera nahi duzu mugitu puntua? (gora/behera/eskuinera/ezkerrera)");
        Scanner sc = new Scanner(System.in);
        String mugitu = sc.nextLine();
        while (true) {

            if (mugitu.equals("gora")) {

            } else if (mugitu.equals("behera")) {

            } else if (mugitu.equals("eskuinera")) {

            } else if (mugitu.equals("ezkerrera")) {

            } else {
                System.out.println("Sartutako balioa ez da egokia, zahiatu berriro");
                System.out.println("Zer norabidera nahi duzu mugitu puntua? (gora/behera/eskuinera/ezkerrera)");
                mugitu = sc.nextLine();
            }
        }
        return puntua;
    }

    // Equals => Insert Code>Equals and hashCode
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Puntua other = (Puntua) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }

    @Override
    public void marraztu() {

        System.out.println(this.toString() + " puntua GUI baten marraztua izan da.");
    }

}

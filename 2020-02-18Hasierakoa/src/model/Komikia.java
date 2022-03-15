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
public class Komikia extends Book {

    private boolean kolorea;

    public Komikia() {
    }

    public Komikia(String name, Author author, double price, int pages, boolean kolorea) {
        super(name, author, price, pages);
        this.kolorea = kolorea;
    }

    public boolean isKolorea() {
        return kolorea;
    }

    public void setKolorea(boolean kolorea) {
        this.kolorea = kolorea;
    }

    public String getNolako() {
        if (kolorea) {
            return "Koloretaoka";
        } else {
            return "Zuri-beltza";
        }
    }


    @Override
    public String toString() {
        return "[Komikia]" + this.getName() + ", " + this.getAuthor() + ", " + this.getNolako()+ ", " + this.getPrice() + ", " + this.getPages();
    }

}

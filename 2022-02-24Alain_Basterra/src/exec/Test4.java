/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import model.Kutxa;
import model.Puntua;

/**
 *
 * @author basterra.alain
 */
public class Test4 {

    public static void main(String[] args) {
        Kutxa k1 = new Kutxa(new Puntua(20, 20), new Puntua(26, 24), 5);
        Puntua p1 = new Puntua(23, 24);
        Puntua p2 = new Puntua(19, 22);
        Puntua p3 = new Puntua(23, 13);

        //int[] ertzak = new int[3];
        Kutxa[] kutxak = new Kutxa[5];
        kutxak[0] = new Kutxa(new Puntua(20, 20), new Puntua(23, 22), 5);
        kutxak[1] = new Kutxa(new Puntua(23, 18), new Puntua(26, 20), 6);
        kutxak[2] = new Kutxa(new Puntua(45, 2), new Puntua(28, 4), 7);
        kutxak[3] = new Kutxa(new Puntua(34, 12), new Puntua(37, 14), 5);
        kutxak[4] = new Kutxa(new Puntua(49, 5), new Puntua(52, 8), 6);
        
        if (k1.isInside(p1)) {
            System.out.println(p1.toString() + " Puntua kutxa barruan dago");
        }
        
        
    }

}

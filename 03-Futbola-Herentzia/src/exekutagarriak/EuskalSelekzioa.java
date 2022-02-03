/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import enumak.Demarkazioa;
import java.util.ArrayList;
import model.*;

/**
 * Programa honetan Euskal Selekzioko datuekin egingo dugu lan. Iturria:
 * https://es.wikipedia.org/wiki/Selecci%C3%B3n_de_f%C3%BAtbol_de_Euskadi#Plantilla
 *
 *
 *
 */
public class EuskalSelekzioa {

    public static int azkenId = 0;

    /**
     * Programa honek metodo desberdinei deituko die banan banan. Beharbada ez
     * diozu koherentzia handirik topatuko programa osoari. Ariketaren helburua
     * da beste pakete bateko klase hierarkia erabiltzen trebatzea.
     *
     */
    public static void main(String[] args) {
        ArrayList<IntegranteSeleccion> selekzioa = new ArrayList<IntegranteSeleccion>();
        selekzioa.add(new Futbolista(azkenId++, Demarkazioa.DEL, 0, "Aitor", "Fernandez", 30));
        selekzioa.add(new Futbolista(azkenId++, Demarkazioa.DEL, 0, "Unai", "Bustinza", 30));
        selekzioa.add(new Futbolista(azkenId++, Demarkazioa.DEL, 0, "Mikel", "Balentziaga", 33));
        selekzioa.add(new Futbolista(azkenId++, Demarkazioa.DEL, 0, "Asier", "Illarramendi", 31));
        selekzioa.add(new Futbolista(azkenId++, Demarkazioa.DEL, 0, "Iñigo", "Martinez", 30));
        selekzioa.add(new Futbolista(azkenId++, Demarkazioa.DEL, 0, "Mikel", "San José", 32));
        selekzioa.add(new Futbolista(azkenId++, Demarkazioa.DEL, 0, "Gaizka", "Larrazabal", 24));
        selekzioa.add(new Futbolista(azkenId++, Demarkazioa.DEL, 0, "Manu", "García", 35));
        selekzioa.add(new Futbolista(azkenId++, Demarkazioa.DEL, 0, "Aritz", "Aduriz", 40));
        selekzioa.add(new Futbolista(azkenId++, Demarkazioa.DEL, 0, "Javier", "Eraso", 31));
        selekzioa.add(new Futbolista(azkenId++, Demarkazioa.DEL, 0, "Asier", "Villalibre", 24));
        selekzioa.add(new Futbolista(azkenId++, Demarkazioa.DEL, 0, "Aihen", "Muñoz", 24));
        selekzioa.add(new Futbolista(azkenId++, Demarkazioa.DEL, 0, "Lago", "Herrerín", 34));
        selekzioa.add(new Futbolista(azkenId++, Demarkazioa.DEL, 0, "Aritz", "Elustondo", 27));
        selekzioa.add(new Futbolista(azkenId++, Demarkazioa.DEL, 0, "Jesús", "Areso", 22));
        selekzioa.add(new Futbolista(azkenId++, Demarkazioa.DEL, 0, "Íñigo", "Vicente", 24));
        selekzioa.add(new Futbolista(azkenId++, Demarkazioa.DEL, 0, "Daniel", "Vivian", 22));
        selekzioa.add(new Entrenador(azkenId++, "RFEF", "Francisco", "Padalino", 65));
        selekzioa.add(new Entrenador(azkenId++, "RFEF", "Joseba", "Núñez", 66));
        selekzioa.add(new Entrenador(azkenId++, "RFEF", "Markel", "Lautadahandi", 67));
        selekzioa.add(new Masajista(azkenId++, 42, "titulacion", "Iñaki", "Sertxiberrieta", 68));
        selekzioa.add(new Masajista(azkenId++, 42, "titulacion", "Ander", "Etxeburu", 69));
        
        
        

        futbolariBat(azkenId);
        bestePartaideBatzukSortu(azkenId);
        selekzioOsoaSortu(azkenId);
        int ezabatzekoIda = 4;
        if (partaideaEzabatu(ezabatzekoIda)) {
            System.out.println(ezabatzekoIda + " id-a duen partaidea ezabatu da.");
        }
    }

    /**
     * Metodo honek "Asier Villalibre"ri dagokion Futbolista objektua sortu eta
     * formatu honetan inprimatzen du: "Futbolista{id=1, nombre=Asier,
     * apellidos=Villalibre, edad=23, dorsal=11, demarcacion=DEL}" Hori lortzeko
     * Futbolista klasean toString() metodoa birdefinitu beharko duzu. Gainera,
     * Web orrian id-rik ez dagoenez, automatikoki kalkulatzea erabaki dugu.
     * Horretarako, kontadore bat (Adibidez, azkenIda izeneko klase atributu
     * bat) erabili dezakezu partaide bat sortzen den bakoitzean handituko dena.
     * Amaitzeko, Villalibre entrenatzen hasiko da.
     */
    public static void futbolariBat(int id) {
        Futbolista f1 = new Futbolista(11, Demarkazioa.DEL, 0, "Asier", "Villalibre", 23);
        System.out.println(f1);
        f1.setId(id);
        System.out.println(f1);

    }

    /**
     * Metodo honek hiru objektu berri sortuko ditu. Pertsona hauei dagokienak:
     * - Javier Clemente Entrenatzailea - Iñaki Sertxiberrieta Fisioterapeuta -
     * Ander Etxeburu medikua Zein klaseko objektua izan behar du bakoitzak?
     *
     * Objektu bakoitza sortu ondoren, bere datuak inprimatu eta kontzentratu
     * eta bidaiatuko dute
     */
    public static void bestePartaideBatzukSortu(int id) {
        Entrenador e1 = new Entrenador(id, "RFEF", "Javier", "Clemente", 71);
        System.out.println(e1);
        e1.viajar();
        e1.concentrarse();
        Masajista m1 = new Masajista(0, 42, "titulacion", "Iñaki", "Sertxiberrieta", 69);
        m1.darMasaje();
        Masajista m2 = new Masajista(0, 42, "titulacion", "Ander", "Etxeburu", 60);
        m2.darMasaje();
    }

    /**
     * Selekzio osoaren datuak gorde "selekzioa" deitutako IntegranteSeleccion
     * klaseko ArrayList estatiko baten.
     *
     */
    public static void selekzioOsoaSortu(int id) {
        ArrayList<IntegranteSeleccion> selekzioa = new ArrayList<IntegranteSeleccion>();
        selekzioa.add(new Futbolista(id++, Demarkazioa.DEL, 0, "Aitor", "Fernandez", 30));
        selekzioa.add(new Futbolista(id++, Demarkazioa.DEL, 0, "Unai", "Bustinza", 30));
        selekzioa.add(new Futbolista(id++, Demarkazioa.DEL, 0, "Mikel", "Balentziaga", 33));
        selekzioa.add(new Futbolista(id++, Demarkazioa.DEL, 0, "Asier", "Illarramendi", 31));
        selekzioa.add(new Futbolista(id++, Demarkazioa.DEL, 0, "Iñigo", "Martinez", 30));
        selekzioa.add(new Futbolista(id++, Demarkazioa.DEL, 0, "Mikel", "San José", 32));
        selekzioa.add(new Futbolista(id++, Demarkazioa.DEL, 0, "Gaizka", "Larrazabal", 24));
        selekzioa.add(new Futbolista(id++, Demarkazioa.DEL, 0, "Manu", "García", 35));
        selekzioa.add(new Futbolista(id++, Demarkazioa.DEL, 0, "Aritz", "Aduriz", 40));
        selekzioa.add(new Futbolista(id++, Demarkazioa.DEL, 0, "Javier", "Eraso", 31));
        selekzioa.add(new Futbolista(id++, Demarkazioa.DEL, 0, "Asier", "Villalibre", 24));
        selekzioa.add(new Futbolista(id++, Demarkazioa.DEL, 0, "Aihen", "Muñoz", 24));
        selekzioa.add(new Futbolista(id++, Demarkazioa.DEL, 0, "Lago", "Herrerín", 34));
        selekzioa.add(new Futbolista(id++, Demarkazioa.DEL, 0, "Aritz", "Elustondo", 27));
        selekzioa.add(new Futbolista(id++, Demarkazioa.DEL, 0, "Jesús", "Areso", 22));
        selekzioa.add(new Futbolista(id++, Demarkazioa.DEL, 0, "Íñigo", "Vicente", 24));
        selekzioa.add(new Futbolista(id++, Demarkazioa.DEL, 0, "Daniel", "Vivian", 22));
        selekzioa.add(new Entrenador(id++, "RFEF", "Francisco", "Padalino", 65));
        selekzioa.add(new Entrenador(id++, "RFEF", "Joseba", "Núñez", 66));
        selekzioa.add(new Entrenador(id++, "RFEF", "Markel", "Lautadahandi", 67));
        selekzioa.add(new Masajista(id++, 42, "titulacion", "Iñaki", "Sertxiberrieta", 68));
        selekzioa.add(new Masajista(id++, 42, "titulacion", "Ander", "Etxeburu", 69));
    }
    /**
     * ArrayListetik objektu bat ezabatzen du. Aurkitzen ez badu false itzuliko
     * du
     *
     * @param id Ezabatu nahi den partaidearen ida
     * @return
     */
    public static boolean partaideaEzabatu(int id) {
    cars.get(id).;
            
    selekzioa.remove(0);
    

        
        return false;
    }
}

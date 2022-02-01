/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import enumak.Demarkazioa;
import model.Entrenador;
import model.Futbolista;



/** Programa honetan Euskal Selekzioko datuekin egingo dugu lan.
 *  Iturria: https://es.wikipedia.org/wiki/Selecci%C3%B3n_de_f%C3%BAtbol_de_Euskadi#Plantilla
 *
 *  
 * 
 */
public class EuskalSelekzioa {
    
    public static int azkenId = 0; 
    
    /** Programa honek metodo desberdinei deituko die banan banan. 
     *  Beharbada ez diozu koherentzia handirik topatuko programa osoari. 
     *  Ariketaren helburua da beste pakete bateko klase hierarkia erabiltzen trebatzea. 
     *   
     */
    public static void main(String[] args) {
        
        int azkenIda = 1;
        
        futbolariBat(azkenIda);
        azkenIda ++;
        bestePartaideBatzukSortu(azkenIda);
        selekzioOsoaSortu();
        int ezabatzekoIda = 4;
        if (partaideaEzabatu(ezabatzekoIda)){
            System.out.println(ezabatzekoIda + " id-a duen partaidea ezabatu da.");
        }
    }
    
    
    /** Metodo honek "Asier Villalibre"ri dagokion Futbolista objektua sortu eta formatu honetan inprimatzen du:    
     *  "Futbolista{id=1, nombre=Asier, apellidos=Villalibre, edad=23, dorsal=11, demarcacion=DEL}"
     *  Hori lortzeko Futbolista klasean toString() metodoa birdefinitu beharko duzu.
     *  Gainera, Web orrian id-rik ez dagoenez, automatikoki kalkulatzea erabaki dugu. 
     *  Horretarako, kontadore bat (Adibidez, azkenIda izeneko klase atributu bat) erabili dezakezu 
     *  partaide bat sortzen den bakoitzean handituko dena. 
     *  Amaitzeko, Villalibre entrenatzen hasiko da.
    */
    public static void futbolariBat(int id){
        Futbolista f1 = new Futbolista (11, Demarkazioa.DEL, 0, "Asier", "Villalibre", 23);        
        System.out.println(f1);
        f1.setId(id);
        System.out.println(f1);
        
    
    }
    
    /** Metodo honek hiru objektu berri sortuko ditu. Pertsona hauei dagokienak: 
     * - Javier Clemente Entrenatzailea
     * - Iñaki Sertxiberrieta Fisioterapeuta
     * - Ander Etxeburu medikua
     * Zein klaseko objektua izan behar du bakoitzak?
     * 
     * Objektu bakoitza sortu ondoren, bere datuak inprimatu eta kontzentratu eta bidaiatuko dute
     */
    public static void bestePartaideBatzukSortu(int id){
        Entrenador e1 = new Entrenador ("RFEF", id, "Javier", "Clemente", 71);
        System.out.println(e1);
    }
    
    
    /** Selekzio osoaren datuak gorde "selekzioa" deitutako IntegranteSeleccion klaseko 
     * ArrayList estatiko baten.
     *  
     */
    public static void selekzioOsoaSortu(){
        
    
    }
    
    /** ArrayListetik objektu bat ezabatzen du. Aurkitzen ez badu false itzuliko du
     * 
     * @param id Ezabatu nahi den partaidearen ida
     * @return 
     */
    public static boolean partaideaEzabatu(int id){

        return false;
    }
}
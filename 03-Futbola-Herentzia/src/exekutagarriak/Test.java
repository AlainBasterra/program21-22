/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;
import enumak.Demarkazioa;
import model.Entrenador;
import model.Futbolista;
import model.Masajista;



/**
 *
 * @author basterra.alain
 */
public class Test {
    public static void main(String[] args) {
        Futbolista f1 = new Futbolista (1,Demarkazioa.POR ,536 ,"Iraizoz" ,"Gorka" ,37);
        Entrenador e1 = new Entrenador();
        Masajista m1 = new Masajista();
        f1.entrenar();
        e1.dirigirEntrenamiento();
        m1.darMasaje();
        
        
        System.out.println(f1);
        System.out.println(e1);
        System.out.println(m1);
    }
    
}

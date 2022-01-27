/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarria;
import model.Cylinder;
import model.Circle;
import java.util.Scanner;

/**
 *
 * @author basterra.alain
 */
public class ZirkuluaSortu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char aukera;
        do {
            System.out.println();
            System.out.print("Zirkulu arrunta edo zilindroa sortu nahi duzu(a/z)? ");
            aukera = sc.next().charAt(0);
            System.out.println("");
            switch (aukera) {
                case 'a':
                    ZirkuluArrunta();
                    break;
                case 'z':
                    Zilindroa();
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
        } while (aukera != 'a' || aukera != 'z');
       
    }
    
    
    public static void ZirkuluArrunta() {
        Circle zirkulua = new Circle();
        System.out.print("Zein izango da bere erradioa? ");
        double erradioa;
        String kolorea;
        Scanner sc = new Scanner(System.in);
        erradioa = sc.nextDouble();
        zirkulua.setRadius(erradioa);
        System.out.print("Zein izango da bere kolorea? ");
        kolorea = sc.next();
        zirkulua.setColor(kolorea);
        System.out.println("Hauek dira sortutako ZIRKULUAren ezaugarriak:");
        System.out.println("Erradioa: " + zirkulua.getRadius());
        System.out.println("Kolorea: " + zirkulua.getColor());
        System.out.println("Azalera: " + zirkulua.getArea());
    }
    
    
    
    public static void Zilindroa(){
        Cylinder zilindroa = new Cylinder();
        System.out.print("Zein izango da bere erradioa? ");
        double erradioa, altuera;
        String kolorea;
        Scanner sc = new Scanner(System.in);
        erradioa = sc.nextDouble();
        zilindroa.setRadius(erradioa);
        System.out.print("Zein izango da bere kolorea? ");
        kolorea = sc.next();
        zilindroa.setColor(kolorea);
        System.out.print("Zein izango da bere altuera? ");
        altuera = sc.nextDouble();
        zilindroa.setHeight(altuera);
        
        System.out.println("Hauek dira sortutako ZIRKULUAren ezaugarriak:");
        System.out.println("Erradioa: " + zilindroa.getRadius());
        System.out.println("Kolorea: " + zilindroa.getColor());
        System.out.println("Altuera: " + zilindroa.getHeight());
        System.out.println("Azalera: " + zilindroa.getArea());
        System.out.println("Bolumena: " + zilindroa.getVolume());
    }
    
    
    
    
}



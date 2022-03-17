/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
/**
 *
 * @author basterra.alain
 */
public class Split {
    public static void main(String[] args) {
        String proba = "875,kljdhfsklj,lkjhlk,03450bkj";
        String[] osagaiak = proba.split(",");
        System.out.println(Arrays.toString(osagaiak));
    }    
}

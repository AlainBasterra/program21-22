/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author basterra.alain
 */
public class terminoakJaso {
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        
        String jasotakoa = "";

        try {
            inputStream = new BufferedReader(new FileReader("probak/hiztegia.csv"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                jasotakoa = jasotakoa.concat(l);
            }            
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }
}

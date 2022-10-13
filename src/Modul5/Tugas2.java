/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5;

/**
 *
 * @author ASUS
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tugas2 {
    public static void main (String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        int angka = 0;
        String status ="";
        
        try{
            System.out.print("Masukkan sebuah angka = ");
            angka = Integer.parseInt(dataIn.readLine());
            
            status = (angka%2==0)?"genap":"ganjil";
        }catch(IOException e){
            System.out.println("Error!");
        }
        
        System.out.println(status);
                
    }
}

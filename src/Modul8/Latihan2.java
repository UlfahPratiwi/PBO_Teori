/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8;

/**
 *
 * @author ASUS
 */
public class Latihan2 {
    public static void main(String[] args){
        
        //arguments = java ArithmeticOperation 20 4
        
        
        double a = Double.parseDouble(args[2]);
        double b = Double.parseDouble(args[3]);
        
        double sum,difference,product,quotient;
        
        sum = a + b;
        difference = a - b;
        product = a * b;
        quotient = a / b ;
        
        System.out.println("Sum         = " + sum);
        System.out.println("Difference  = " + difference);
        System.out.println("Product     = " + product);
        System.out.println("Quotiennt   = " + quotient);
        
    }
}

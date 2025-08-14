/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;


/**
 *
 * @author nahue
 */
public class EJ4 {
       public static void main(String[] args) {
    
    Scanner input=new Scanner (System.in);                
       
       
        
        double A=0.10;
        double B=0.15;
        double C=0.20;
        
        System.out.println("Ingrese precio ");
        int precio=Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese categoria(A,B,C) ");
        char categoria = Character.toUpperCase(input.nextLine().charAt(0));
        if (categoria =='A'){
            System.out.println("Descuento aplicado 10% ");
            System.out.println("Precio final " + precio * A);
        }   
        else if (categoria =='B'){
            System.out.println("Descuento aplicado 15% ");
            System.out.println("Precio final " + precio * B);
        }
        else if (categoria =='C'){
            System.out.println("Descuento aplicado 20% ");
            System.out.println("Precio final " + precio * C);
        }
        else {
            System.out.println("Entrada no valida");
        }
        
              
    
    
     }
}

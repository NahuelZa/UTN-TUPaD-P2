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
public class EJ5 {
       public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int total=0;
        System.out.println("Ingrese numeros 0 para finalizar ");
        int numeros=Integer.parseInt(input.nextLine());
            
        while (numeros!=0){
            if (numeros%2==0){
                total+=numeros;               
            }
             System.out.println("Ingrese numeros 0 para finalizar ");
             numeros=Integer.parseInt(input.nextLine());
        }
        System.out.println("la suma de los numeros pares es " + total);
    
    
    }
    
}

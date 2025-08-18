/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hola.mundo;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class EJ3 {
    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner input = new Scanner (System.in);
   
   
   
   String nombre=input.nextLine();
   int edad = Integer.parseInt(input.nextLine());
   double altura=input.nextDouble();
    
        System.out.println("Hola " + nombre + " de edad " + edad + " y que mide " + altura);
        
    
        
        
    }
    
}

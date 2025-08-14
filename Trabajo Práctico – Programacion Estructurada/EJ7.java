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
public class EJ7 {
       public static void main(String[] args) {
        int nota=0;
        Scanner input=new Scanner (System.in);
        
        System.out.println("Ingrese una nota  (0-10)");
        nota=Integer.parseInt(input.nextLine());
        if (nota <0 || nota >10){         
        
            do{
               System.out.println("Ingrese una nota valida (0-10)");
               nota=Integer.parseInt(input.nextLine());
            }
            while (nota <0 || nota >10);
        }
        
        System.out.println("Nota guardada correctamente");
        
    
    
    }
    
}

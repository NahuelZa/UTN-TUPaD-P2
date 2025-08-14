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
public class Ej_2 {
    
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        
            
        System.out.println("INgrese 1 numero");
        int num_1= Integer.parseInt(input.nextLine());
        System.out.println("Ingrese 2 numero");
        int num_2= Integer.parseInt(input.nextLine());
        System.out.println("Ingrese 3 numero");
        int num_3= Integer.parseInt(input.nextLine());
    
        System.out.println("El mayor es " + esMayor(num_1, num_2, num_3));
    
    }
    
     static int esMayor (int x, int y, int z){
         int mayor=x;
         if (y>mayor && y>z){
             mayor=y;
         }
         else if (z>mayor){
             mayor=z;
         };
         return mayor;
     }
}

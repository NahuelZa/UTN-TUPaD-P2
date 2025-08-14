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
public class EJ6 {
       public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int positivo,negativo,ceros;
        positivo=0;
        negativo=0;
        ceros=0;
        
        for (int numeros=1;numeros<=10;numeros++){
        System.out.println("Ingrese numero a sumar ");
        int numero=Integer.parseInt(input.nextLine());
        if (numero>0){
            positivo+=1;
        }
        else if (numero<0){
            negativo+=1;
        }
        else {
            ceros+=1;
        }
        }
        System.out.println("Positivos " + positivo);
        System.out.println("negativo " + negativo);
        System.out.println("ceros " + ceros);
    
    
    
    
    }
    
}

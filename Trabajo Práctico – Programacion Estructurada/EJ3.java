/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;
import static javaapplication2.EJ1.esBisiesto;

/**
 *
 * @author nahue
 */
public class EJ3 {
       public static void main(String[] args) {
    
    Scanner input=new Scanner (System.in);                
       
       
        System.out.println("Ingrese su edad");
        
        int edad=Integer.parseInt(input.nextLine());
        clasificacion(edad);
            
    }
    
    static void clasificacion ( int edad){
        if (edad<12){
            System.out.println("Ninio");
        }
        else if (edad>12 && edad<17){
            System.out.println("Adolescente");
            
        }
        else if (edad>18 && edad<59){
            System.out.println("Adulto");
            
        }
        else {
            System.out.println("Adulto mayor");
        }
        
    }
    
    }
    


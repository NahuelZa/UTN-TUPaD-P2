/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class EJ1 {

   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);                
       
       
        System.out.println("Ingrese un anio");
        
        int anio=Integer.parseInt(input.nextLine());
        esBisiesto(anio);
            
    }
            
  static void  esBisiesto (int anio){
            if ((anio%4==0 && anio%100!=0) || (anio/400==0 )){
                System.out.println("Es bisiesto");
            }
            else{
                System.out.println("No es bisiesto");    
                
              
        }
 }
        
}            
     
        

    

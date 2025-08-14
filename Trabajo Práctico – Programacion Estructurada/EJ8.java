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
public class EJ8 {
       public static void main(String[] args) {
           
         Scanner input=new Scanner (System.in);                
       
       
        System.out.println("Ingrese precio base del producto");
        double precio=Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%)");
        double impuesto=Double.parseDouble(input.nextLine());
        impuesto/=100;
        
        System.out.println("Ingrese el descuento en porcentaje  (Ejemplo: 5 para 5%");
        double descuento=Double.parseDouble(input.nextLine());
        descuento/=100;
        
        calcularPrecioFinal(precio,impuesto, descuento);
            
    }
            
  static void  calcularPrecioFinal (double precio,double impuesto, double descuento){
      double PrecioFinal;      
            PrecioFinal=precio+(precio*impuesto)-(precio*descuento);
            System.out.println("El precio final es "+ PrecioFinal);
     
    
    
    }

   
    
}

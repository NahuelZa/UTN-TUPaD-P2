/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;
import static javaapplication2.EJ9.calcularCostoEnvio;
import static javaapplication2.EJ9.calcularTotalCompra;

/**
 *
 * @author nahue
 */
public class EJ11 {
    final static double descuento=0.10;
    
       public static void main(String[] args) {
           
         Scanner input=new Scanner (System.in);
         
        System.out.println("Ingrese precio del producto");
        double precio=Integer.parseInt(input.nextLine());
        
        
        
      calcularDescuentoEspecial(precio);
         
       }
      static void calcularDescuentoEspecial (double precio){
          System.out.println("el precio final con descuento es " + precio * (1-descuento)); 
      }
}

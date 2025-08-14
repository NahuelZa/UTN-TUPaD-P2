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
public class EJ10 {
       public static void main(String[] args) {
           
         Scanner input=new Scanner (System.in);
         
        System.out.println("Ingrese stock actual del producto");
        int stockActual=Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese cantidad vendida");
        int cantidadVendida=Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese cantidad recibida");
        int cantidadRecibida=Integer.parseInt(input.nextLine());
                
        
       
           System.out.println("El nuevo stock del producti es " + actualizarStock( stockActual,  cantidadVendida, cantidadRecibida));
        
            
    }
            
  
static int actualizarStock (int stockActual, int cantidadVendida, int cantidadRecibida){
    int stockTotal= 0;
    stockTotal=stockActual - cantidadVendida + cantidadRecibida;
    return stockTotal;
}
   
    
}

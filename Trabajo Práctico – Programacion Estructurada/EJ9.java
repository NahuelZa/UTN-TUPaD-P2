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
public class EJ9 {
       public static void main(String[] args) {
           
         Scanner input=new Scanner (System.in);                
       
        System.out.println("Ingrese precio del producto");
        double precio=Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese el peso del paquete en kg");
        double peso=Double.parseDouble(input.nextLine());
                
        System.out.println("Ingrese la zona de envio (Nacional/Internacional");
        String zona=input.nextLine();
    
        System.out.println("el total del envio es " + calcularCostoEnvio(peso,zona.toLowerCase()));
                
        System.out.println("el total a pagar es " + calcularTotalCompra(precio,calcularCostoEnvio(peso,zona.toLowerCase())));
        }
       
    static double calcularCostoEnvio(double peso, String zona){
           double precio_envio=0;
           double precio_total;
           if (zona.equals("nacional")){
               precio_envio=5;
           }
           else if (zona.equals("internacional")){
               precio_envio=10;
           }
           else {
                   System.out.println("Zona no valida");
                   }
           
           precio_total=precio_envio*peso;
           
           return precio_total;
    }
    
    
    static double calcularTotalCompra(double precioProducto, double precioEnvio){        
    
            double total = 0;
            total= precioProducto + precioEnvio;
            
            return total;
            }
}

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
public class EJ113 {
    
    
       public static void main(String[] args) {
           
        Scanner input=new Scanner (System.in);
        double[] productos={199.99,299.5,149.75,399,89.99}; 
       
        
        mostrarProductos(productos.length, productos);
        
        System.out.println("Quisiera modificar algun valor? y/n");
           char respuesta= input.nextLine().charAt(0);
           if (respuesta == 'y' || respuesta == 'Y'){               
           
                System.out.println("Que valor quisiera modificar?(agrege index) ");
                int modificar=Integer.parseInt(input.nextLine());


                System.out.println("Que valor quisiera agregar?");
               int agregar=Integer.parseInt(input.nextLine());
               productos[modificar]=agregar;
            }
           else {
               System.out.println("No se cambio ningun valor de la lista");
            }
           
           mostrarProductos(productos.length, productos);
           
        
       }
       
       static void mostrarProductos(int x,double[] productos){
           if (x==0){
               x= 0;
           }
           else {
               mostrarProductos(x-1,productos);
               System.out.println(productos[x-1] + " index numero " + (x-1));
           }
           
           
           
       }
}


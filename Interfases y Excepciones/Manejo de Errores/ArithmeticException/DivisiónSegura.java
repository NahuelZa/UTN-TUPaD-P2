/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package división.segura;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class DivisiónSegura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.println("Ingrese n1");
       int n1=input.nextInt();
        System.out.println("Ingrese n2");
       int n2=input.nextInt();
       double total =0.0;
       
       try {
           
       total=n1/n2;
         
       }
       catch (ArithmeticException ae){
           System.out.println("No se puede dividir por 0"+ae.getMessage());
           ae.printStackTrace(System.out);
           
       } 
       finally {
           System.out.println(total);
       }
        
        // TODO code application logic here
    }
    
}

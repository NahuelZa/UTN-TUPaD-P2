/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversión.de.cadena.a.número;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ConversiónDeCadenaANúmero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("Ingrese cadena de texto ");
        
        String cadena1=input.nextLine();
        int cadenaAint=0;
        try {cadenaAint=Integer.parseInt(cadena1);
            
        }
        catch (NumberFormatException nfe){
            System.out.println("No se puede convertir cadena a integro "+nfe.getMessage());
            nfe.printStackTrace(System.out);
            
        }
            
        
        System.out.println(cadenaAint);
    }
    
}

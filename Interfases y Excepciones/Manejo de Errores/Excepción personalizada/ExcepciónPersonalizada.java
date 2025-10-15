/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepción.personalizada;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ExcepciónPersonalizada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese edad");
       
            int edad = input.nextInt();
            if (edad<0 || edad>120)
            throw new EdadInvalidaException("La edad no puede ser menor a 0 o mayor a 120");
            System.out.println(edad);
        }
    }



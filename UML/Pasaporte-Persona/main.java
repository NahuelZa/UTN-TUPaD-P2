/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uml;

import uml.Foto;
import uml.Titular;

/**
 *
 * @author nahue
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pasaporte pepePass=new Pasaporte(39455,"10/04/1485","cara pelado","jpg");
        Titular pepe=new Titular("Pepe",45124147);
        pepePass.setTitular(pepe);
        System.out.println(pepePass);
    }
    
}
    
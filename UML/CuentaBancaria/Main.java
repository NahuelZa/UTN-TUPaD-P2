/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentabancaria;

/**
 *
 * @author nahue
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaBancaria B45X=new CuentaBancaria(445158755,4515.45,4975,"15/09/2025");
        Titular Alfonso = new Titular("Alfonso",8745154);
        B45X.setTitular(Alfonso);
        System.out.println(B45X);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaz;

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
        TarjetaCredito Visa=new TarjetaCredito();
        TarjetaCredito MasterCard=new TarjetaCredito();
        Transferencia BBVA=new Transferencia();
        Transferencia Ing=new Transferencia();
        Efectivo dolares=new Efectivo();
        
       dolares.procesarPago();
        }
    }
    


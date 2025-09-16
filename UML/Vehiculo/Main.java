/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculo;

/**
 *
 * @author nahue
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor ARX4=new Motor("Electrico",145444);
        Vehiculo Fiat=new Vehiculo("ABC123","Duna",ARX4);
        Conductor pepe=new Conductor(45184,"pepe");
        Fiat.setConductor(pepe);
        
        System.out.println(Fiat);
    }
    
}

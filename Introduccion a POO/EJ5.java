/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerobjeto;

/**
 *
 * @author nahue
 */
public class EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       EJ5Nave nave1=new EJ5Nave();
       nave1.setNombre("Halcon Milenario");
       nave1.despegar();
       nave1.avanzar(50);
       nave1.recargarCombustible(451);
       nave1.despegar();
       nave1.avanzar(50);
     nave1.mostrarEstado();
      
    }
    
}

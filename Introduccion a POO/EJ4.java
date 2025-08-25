/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerobjeto;

/**
 *
 * @author nahue
 */
public class EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Ej4Gallinas gallina1=new Ej4Gallinas();
       gallina1.mostrarEstado();
       gallina1.envejecer(4);
       gallina1.ponerHuevo(5);
       gallina1.idGallina(415);
       gallina1.mostrarEstado();
      
       
       
       
       
       Ej4Gallinas gallina2=new Ej4Gallinas();
       gallina2.mostrarEstado();
       gallina2.envejecer(5);
       gallina2.ponerHuevo(3);
       gallina2.idGallina(184);
       gallina2.mostrarEstado();
    }
    
}

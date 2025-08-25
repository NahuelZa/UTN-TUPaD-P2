/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerobjeto;

/**
 *
 * @author nahue
 */
public class EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Ej2Mascota mascota1=new Ej2Mascota();
       mascota1.nombre="Jira";
       mascota1.especie="Reptil";
       mascota1.edad=9;
       
       mascota1.getInfo();
       
       mascota1.setAnios(4);
       mascota1.getInfo();
       mascota1.setAnios(-4);
       mascota1.getInfo();
       
    }
    
}

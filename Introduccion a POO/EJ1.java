/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerobjeto;

/**
 *
 * @author nahue
 */
public class EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       EJ1Estudiante estudiante1=new EJ1Estudiante();
       estudiante1.nombre="Pedro";
       estudiante1.apellido="Perez";
       estudiante1.curso=3;
       estudiante1.calificacion=7.5;
       estudiante1.getInfo();
       
       estudiante1.setCalificacion(4);
       estudiante1.getInfo();
       estudiante1.setCalificacion(-4);
       estudiante1.getInfo();
       
    }
    
}

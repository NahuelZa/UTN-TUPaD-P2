/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerobjeto;

/**
 *
 * @author nahue
 */
public class EJ1Estudiante {
     String nombre;
     String apellido;
     int curso;
     double calificacion;
    
    
    
    
    void getInfo(){
        System.out.println(nombre + " " + apellido + " " + curso + " " + calificacion);
    }
    
    void setCalificacion(double puntos){
        calificacion=calificacion+puntos;
    }
    
    

}


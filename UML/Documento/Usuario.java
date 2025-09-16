/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package documento;

/**
 *
 * @author nahue
 */
public class Usuario {

   private int licencia;
   private String nombre;
   
   public Usuario(int licencia,String nombre){
       this.licencia=licencia;
       this.nombre=nombre;
   }

    @Override
    public String toString() {
        return "Usuario{" + "licencia=" + licencia + ", nombre=" + nombre + '}';
    }
    
}

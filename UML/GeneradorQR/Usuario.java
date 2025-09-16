/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generadorqr;

/**
 *
 * @author nahue
 */
public class Usuario {

    private String nombre;
    private String email;
    
    
    
    public Usuario(String nombre,String email){
        this.nombre=nombre;
        this.email=email;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", email=" + email + '}';
    }
    
}

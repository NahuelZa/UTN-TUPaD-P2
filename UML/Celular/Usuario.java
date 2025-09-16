/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package celular;

/**
 *
 * @author nahue
 */
public class Usuario {
    private String nombre;
    private int dni;
    private Celular celular;
  
    public Usuario (String nombre,int dni){
        this.nombre=nombre;
        this.dni=dni;
    }
    
    

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
        if (celular!=null && celular.getUsuario()!=this){
            celular.setUsuario(this);
        };
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
    
    

    
    
    
    

 
    
}

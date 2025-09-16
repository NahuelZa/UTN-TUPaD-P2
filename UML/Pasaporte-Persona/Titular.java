/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uml;

/**
 *
 * @author nahue
 */
public class Titular {
    private String nombre;
    private int dni;
    private Pasaporte pasaporte;
    
    
    public Titular(String nombre,int dni){    
    this.nombre=nombre;
    this.dni=dni;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }   
   
    public void setPasaporte(Pasaporte pasaporte){
       this.pasaporte=pasaporte;
        
       if(pasaporte!=null && pasaporte.getTitular()!=this){
           pasaporte.setTitular(this);
       }
   }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
    
    
}

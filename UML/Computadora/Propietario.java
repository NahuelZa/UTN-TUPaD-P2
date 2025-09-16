/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computadora;

/**
 *
 * @author nahue
 */
public class Propietario {

    private String nombre;
    private int dni;
    private Computadora computadora;

    public Computadora getComputadora() {
        return computadora;
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
    
    public Propietario(String nombre,int dni){
        this.nombre=nombre;
        this.dni=dni;
    }
    
    void setComputadora(Computadora computadora){
        this.computadora=computadora;
        if(computadora!=null && computadora.getPropietario()!=this){
            computadora.setPopietario(this);
        }
    }
    
}

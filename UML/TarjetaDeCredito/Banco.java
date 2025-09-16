/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarjetadecredito;

/**
 *
 * @author nahue
 */
public class Banco {

    private String nombre;
    private int cuit;
    
    public Banco(String nombre,int cuit){
        this.nombre=nombre;
        this.cuit=cuit;
    }

    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + ", cuit=" + cuit + '}';
    }
    
}

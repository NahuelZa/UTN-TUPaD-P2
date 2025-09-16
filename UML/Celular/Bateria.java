/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package celular;

/**
 *
 * @author nahue
 */
public class Bateria {
    private String modelo;
    private String capacidad;
  
    public Bateria(String modelo,String capacidad){
        this.modelo=modelo;
        this.capacidad=capacidad;
    }

    @Override
    public String toString() {
        return "modelo=" + modelo + ", capacidad=" + capacidad + '}';
    }
    
}

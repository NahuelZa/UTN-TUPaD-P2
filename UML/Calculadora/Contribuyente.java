/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author nahue
 */
public class Contribuyente {
  private String nombre;
  private int cuil;
  
  
  public Contribuyente(String nombre, int cuil){
      this.nombre=nombre;
      this.cuil=cuil;      
  }

    @Override
    public String toString() {
        return "Contribuyente{" + "nombre=" + nombre + ", cuil=" + cuil + '}';
    }
  
}

    

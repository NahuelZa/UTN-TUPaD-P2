/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libro;

/**
 *
 * @author nahue
 */
public class Autor {
    private String nombre;
    private String nacionalidad;

public Autor(String nombre,String nacionalidad){
    this.nombre=nombre;
    this.nacionalidad=nacionalidad;
}    

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}';
    }
   
}

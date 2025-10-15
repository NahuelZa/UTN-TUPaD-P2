/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pagable2;

/**
 *
 * @author nahue
 */
public class Producto2 implements Pagable2 {

    private String nombre;
    private int precio;

    public Producto2(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public double calcularTotal() {
        return 0;}

   

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagable2;

/**
 *
 * @author nahue
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private int edad;
    private Pagable2 pedido2;

    public Cliente(String nombre, String apellido, int edad, Pagable2 pedidos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pedido2 = pedidos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", pedido2=" + pedido2 + '}';
    }
    
    
    
    
}

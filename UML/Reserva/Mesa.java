/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reserva;

/**
 *
 * @author nahue
 */
public class Mesa {

    private int numero;
    private String capacidad;

    public Mesa(int numero, String capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Mesa{" + "numero=" + numero + ", capacidad=" + capacidad + '}';
    }

}

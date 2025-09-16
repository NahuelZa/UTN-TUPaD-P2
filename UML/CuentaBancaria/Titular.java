/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentabancaria;

/**
 *
 * @author nahue
 */
public class Titular {

    private String nombre;
    private int dni;
    private CuentaBancaria cuentabancaria;

    public Titular(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    void setCuentabancaria(CuentaBancaria cuentabancaria) {
        this.cuentabancaria = cuentabancaria;
        if (cuentabancaria != null && cuentabancaria.getTitular()!=this) {
            cuentabancaria.setTitular(this);
        }
    }

    public CuentaBancaria getCuentabancaria() {
        return cuentabancaria;
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }

}

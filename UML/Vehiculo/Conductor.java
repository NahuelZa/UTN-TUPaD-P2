/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculo;

/**
 *
 * @author nahue
 */
public class Conductor {

    private int licencia;
    private String nombre;
    private Vehiculo vehiculo;

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Conductor(int licencia, String nombre) {
        this.licencia = licencia;
        this.nombre = nombre;
    }

    void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        if (vehiculo.getConductor() != this && vehiculo != null) {
            vehiculo.setConductor(this);
        }
    }

    @Override
    public String toString() {
        return "Conductor{" + "licencia=" + licencia + ", nombre=" + nombre + '}';
    }

    

}

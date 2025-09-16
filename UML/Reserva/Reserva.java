/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reserva;

/**
 *
 * @author nahue
 */
public class Reserva {

    private String fecha;
    private String hora;
    private Mesa mesa;
    private Cliente cliente;

    public Reserva(String nombre, String telefono, Mesa mesa) {
        this.fecha = nombre;
        this.hora = telefono;
        this.mesa = mesa;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Reserva{" + "fecha=" + fecha + ", hora=" + hora + ", mesa=" + mesa + ", cliente=" + cliente + '}';
    }

}

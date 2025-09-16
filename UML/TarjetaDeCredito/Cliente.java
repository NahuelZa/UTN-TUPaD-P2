/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarjetadecredito;

/**
 *
 * @author nahue
 */
public class Cliente {
private String nombre;
private int dni;
private TarjetaDeCredito tarjeta;


public Cliente(String nombre,int dni){
    this.nombre=nombre;
    this.dni=dni;
}

    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }

    

void setTarjeta(TarjetaDeCredito tarjeta){
    this.tarjeta=tarjeta;
    if (tarjeta!=null && tarjeta.getCliente()!=this)
        tarjeta.setCliente(this);
}

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
}

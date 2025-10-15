/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagable2;

import java.util.ArrayList;

/**
 *
 * @author nahue
 */
public class Pedido2 implements Pagable2, Pago, PagoConDescuento {

    private ArrayList<Producto2> productos;
    private MediosPago medioDePago;
    public final static double PorcentajeDescuento = 0.15;

    public Pedido2(MediosPago medioDePago) {
        this.medioDePago = medioDePago;
        this.productos = new ArrayList<>();
    }

    public void agregarProductos(Producto2 producto) {
        productos.add(producto);

    }

    @Override
    public double calcularTotal() {
        int total = 0;
        for (Producto2 producto : productos) {
            total += producto.getPrecio();

        }

        return total;

    }

    @Override
    public void procesarPago() {
        if (calcularTotal() > 0) {

            System.out.println("Pago de " + calcularTotal() + " Cobrado exitosamente ");

        } else {
            System.out.println("Monto no valido");
        }
    }

    @Override
    public void PagoConDescuento() {
        if (calcularTotal() > 0) {

            if (medioDePago == MediosPago.AMERICAN_EXPRESS || medioDePago==MediosPago.PAYPAL) {

                System.out.println("Tarjeta valida para descuento pago de " + calcularTotal() * (1 - PorcentajeDescuento) + " Cobrado exitosamente ");

            } 
            else {
                System.out.println("Metodo de pago sin descuento monto a pagar = " + calcularTotal());
            }
        }
        else {
                System.out.println("Monto no valido");
            }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pagable2;

/**
 *
 * @author nahue
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto2 Leche=new Producto2("Leche",1500);
        Producto2 Jamon=new Producto2("Jamon",2500);
        
        //Pedido2 PedidoA34=new Pedido2(MediosPago.AMERICAN_EXPRESS);
        Pedido2 PedidoA34=new Pedido2(MediosPago.PAYPAL);
        
        PedidoA34.agregarProductos(Leche);
        PedidoA34.agregarProductos(Jamon);
        Cliente Pedro= new Cliente("Pedro","Sanchez",24,PedidoA34);
        
        System.out.println(PedidoA34.calcularTotal());
        
        PedidoA34.procesarPago();
        PedidoA34.PagoConDescuento();
        
        
    }
    
}

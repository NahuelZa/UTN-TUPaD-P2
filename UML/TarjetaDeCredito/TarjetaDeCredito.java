/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarjetadecredito;

/**
 *
 * @author nahue
 */
public class TarjetaDeCredito {

    private int numero;
    private String fechaVencimiento;
    private Banco banco;
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

   
    
    public TarjetaDeCredito(int numero,String fechaVencimiento,Banco banco){
        this.numero=numero;
        this.fechaVencimiento=fechaVencimiento;
        this.banco=banco;               
                
    }
    void setCliente(Cliente cliente){
        this.cliente=cliente;
        if(cliente.getTarjeta()!=this && cliente!=null){
            cliente.setTarjeta(this);
        }
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "numero=" + numero + ", fechaVencimiento=" + fechaVencimiento + ", banco=" + banco + ", cliente=" + cliente + '}';
    }
    
    
}

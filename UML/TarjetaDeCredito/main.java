/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarjetadecredito;

/**
 *
 * @author nahue
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco BBVA=new Banco ("BBVA",455155);
        TarjetaDeCredito visa=new TarjetaDeCredito (45444,"15/09/2027",BBVA);
        Cliente Juan=new Cliente("Juan",45145414);
        visa.setCliente(Juan);
        System.out.println(visa);
    }
   
}

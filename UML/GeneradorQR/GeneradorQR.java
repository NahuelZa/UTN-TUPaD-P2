/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generadorqr;

/**
 *
 * @author nahue
 */
public class GeneradorQR {

    void generar(int valor,Usuario usuario){
        CodigoQR QR =new CodigoQR(valor,usuario);
        System.out.println("Codigo QR generado con siguientes datos: Valor= " + QR.getValor() + " Usuario "+ QR.getUsuario());
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario Jorge= new Usuario("Jorge","J.A@gmail.com");
        GeneradorQR PL4=new GeneradorQR();
        PL4.generar(41145,Jorge);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author nahue
 */
public class Calculadora {
    
    void calcular (Impuesto impuesto){
        System.out.println("El monto del contribuyente " + impuesto.getContribuyente() + " es " + impuesto.getMonto());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Impuesto n45=new Impuesto(45.48);
Contribuyente Juan = new Contribuyente ("Juan",1357845);
n45.setContribuyente(Juan);
Calculadora Casio=new Calculadora();
Casio.calcular(n45);
    }
    
}

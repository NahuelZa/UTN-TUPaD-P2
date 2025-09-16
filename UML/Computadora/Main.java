/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computadora;

/**
 *
 * @author nahue
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Propietario Pedro=new Propietario("Pedro",87454144);
        Computadora Alienware=new Computadora("Alienware",13454111,"intel","AGXC4");
        Pedro.setComputadora(Alienware);
        System.out.println(Alienware);
        
    }
    
}

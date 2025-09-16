/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package celular;

/**
 *
 * @author nahue
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bateria batSamsumg=new Bateria("JH454","450Ah");
        Usuario Pedro=new Usuario("Pedro",34145174);
        Celular samsung=new Celular("DA4546","Samsung","X3Pro",batSamsumg);
        samsung.setUsuario(Pedro);        
        System.out.println(samsung);
        
        
    }
    
}

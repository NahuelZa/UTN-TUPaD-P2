/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computadora;

/**
 *
 * @author nahue
 */
public class PlacaMadre {

   private String modelo;
   private String chipSet;
   
   
    public PlacaMadre(String modelo,String chipSet){
        
    
            this.modelo=modelo;
            this.chipSet=chipSet;
            }

    @Override
    public String toString() {
        return "PlacaMadre{" + "modelo=" + modelo + ", chipSet=" + chipSet + '}';
    }
    
}

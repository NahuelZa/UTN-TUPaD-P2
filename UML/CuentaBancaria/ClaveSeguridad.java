/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentabancaria;

/**
 *
 * @author nahue
 */
public class ClaveSeguridad {

   private int codigo;
   private String ultimamodificacion;
   
   public ClaveSeguridad(int codigo,String ultimamodificacion){
       this.codigo=codigo;
       this.ultimamodificacion=ultimamodificacion;
   }

    @Override
    public String toString() {
        return "ClaveSeguridad{" + "codigo=" + codigo + ", ultimamodificacion=" + ultimamodificacion + '}';
    }
    
}

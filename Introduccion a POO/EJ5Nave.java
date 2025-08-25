/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerobjeto;

/**
 *
 * @author nahue
 */
public class EJ5Nave {
     private String nombre;
     private double combustible;
    
            
     
    void setNombre(String nombreNave){
         nombre=nombreNave;
     }
     
     
     void avanzar(double distancia){
         if(combustible>=distancia){
             System.out.println("Se puede viajar");
             combustible-=distancia;
         }
         else
         {
             System.out.println("Se necesita recargar combustible no alcanza para el viaje");
         }
     }
    
     void despegar(){
        if (combustible>=50){
            System.out.println("Se puede despegar");
        }
        else{
            System.out.println("No hay combustible suficiente para despegar");
        }
     }
    
   void recargarCombustible(int cantidad){
         if(cantidad<=500 && cantidad>0){
             System.out.println("Cargando....");
             combustible+=cantidad;
         }
         else
         {
             System.out.println("Se exedio del limite recarga no valida");
         }
     }
  
    void mostrarEstado(){
         System.out.println(nombre + " " + combustible);
     }

}


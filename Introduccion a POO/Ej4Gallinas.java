/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerobjeto;

/**
 *
 * @author nahue
 */
public class Ej4Gallinas {
     private int idGallina;
     private int huevosPuestos;
     private int edad;
     
    
    void mostrarEstado(){
        System.out.println(idGallina + " " + huevosPuestos + " " + edad );
    }
    
    
    void idGallina(int id){
    idGallina=id;
    }
    
    void envejecer(int anios){
        edad=edad+anios;
    }
    
  
    void ponerHuevo(int Huevos){
        huevosPuestos=huevosPuestos+Huevos;
    }
    
  
    

}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerobjeto;

/**
 *
 * @author nahue
 */
public class Ej3Libro {
     private String titulo;
     private String autor;
     private int añoPublicacion;
     
    
    void getInfo(){
        System.out.println(titulo + " " + autor + " " + añoPublicacion );
    }
    
    void setTitulo(String titulo2){
        titulo=titulo2;
    }
    void setAutor(String autor2){
        autor=autor2;
    }
    
    void setAnios(int anios){
        añoPublicacion=anios;
    }
    
    

}


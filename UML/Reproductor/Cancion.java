/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reproductor;

/**
 *
 * @author nahue
 */
public class Cancion {
    private String titulo;
    private Artista artista;
    
    
    
    
    
    public Cancion(String titulo){
        this.titulo=titulo;
    }
    
    void setArtista(Artista artista){
        this.artista=artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    @Override
    public String toString() {
        return "Cancion{" + "artista=" + artista + '}';
    }
    
   
    
}

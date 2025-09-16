/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reproductor;

/**
 *
 * @author nahue
 */
public class Reproductor {
 void reproducir(Cancion cancion){
        System.out.println("Reproduciendo" + cancion.getTitulo() + "de " + cancion.getArtista());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Cancion AB15= new Cancion(" nos siguen pegando abajo ");
     Artista Charlie= new Artista("Charlie","Rock");
     Reproductor mp3=new Reproductor();
     AB15.setArtista(Charlie);
     mp3.reproducir(AB15);
     
}
    
}
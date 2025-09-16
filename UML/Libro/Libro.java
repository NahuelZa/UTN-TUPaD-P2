/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libro;

/**
 *
 * @author nahue
 */
public class Libro {
    private String titulo;
    private int isbn;
    private Autor autor;
    private Editorial editorial;

    
   public Libro(String titulo,int isbn,Editorial editorial){
       this.titulo=titulo;
       this.isbn=isbn;
       this.editorial=editorial;
   }
    public void setAutor(Autor autor){
        this.autor=autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", editorial=" + editorial + '}';
    }

   
}

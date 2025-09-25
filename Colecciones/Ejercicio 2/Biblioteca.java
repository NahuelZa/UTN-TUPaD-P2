/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autor;

import java.util.ArrayList;

/**
 *
 * @author nahue
 */
public class Biblioteca {

    private String nombre;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));

    }

    public void listarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        Libro encontrado = null;
        int i = 0;
        while (i < libros.size() && encontrado == null) {
            if (libros.get(i).getIsbn().equals(isbn)) {
                encontrado = libros.get(i);
                System.out.println(encontrado);
            } else {
                i++;
            }
        }
        if (encontrado == null) {
            System.out.println("Libro no encontrado");
        }
        return encontrado;
    }
    
    void eliminarLibro(String isbn){
        Libro borradoEncontrado=buscarLibroPorIsbn(isbn);
        if(borradoEncontrado!=null){
            libros.remove(borradoEncontrado);
            System.out.println("Libro: " + borradoEncontrado + " eliminado");
            
        }
    }
    
    void obtenerCantidadLibros(){
        int i=0;
        for (Libro libro:libros){
            i++;            
        }
        System.out.println("Cantidad de libros: "+ i);
    }
    
    void filtrarLibrosPorAnio(int anio){
        ArrayList<Libro> filtro=new ArrayList<>();
        for(Libro libro:libros){
            if(libro.getAnioPublicacion()==anio){
                filtro.add(libro);               
            }           
        }
        System.out.println(filtro);
    }
    
    
    @Override
    public String toString() {
        return "Biblioteca{" + "nombre=" + nombre + ", libros=" + libros + '}';
    }

    /* 
 
 
 
 */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}

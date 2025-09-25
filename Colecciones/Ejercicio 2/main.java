/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autor;

/**
 *
 * @author nahue
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Biblioteca UBA=new Biblioteca("UBA");
        Autor Rolon=new Autor("1","Gabriel","Argentino");
        Autor Borges=new Autor("2","Borges","Argentino");
        Autor Cortazar=new Autor("3","Cortazar","Argentino");
        UBA.agregarLibro("1234","La Felicidad",2025,Rolon);
        UBA.agregarLibro("4321","Ficciones",1948,Borges);
        UBA.agregarLibro("1784","El Aleph",1945,Borges);
        UBA.agregarLibro("12344","Rayuela",1960,Cortazar);
        UBA.agregarLibro("122434","Los Padecientes",2010,Rolon);
        
        /*UBA.listarLibros();
        UBA.buscarLibroPorIsbn("1234"); 
        UBA.eliminarLibro("1234");
        UBA.obtenerCantidadLibros();
        UBA.filtrarLibrosPorAnio(2025);
        */
        Autor.mostrarAutoresDisponibles();
    }
    
}

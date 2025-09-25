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
public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;
    
    
    
    public static ArrayList<Autor> listaAutores=new ArrayList<>();

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        listaAutores.add(this);
    }
    
    public static void mostrarAutoresDisponibles(){
        for(Autor autor:listaAutores){
            System.out.println(autor.getNombre());
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Autor{" + "id=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}';
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

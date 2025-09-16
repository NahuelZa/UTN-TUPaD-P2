/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package editorvideo;

/**
 *
 * @author nahue
 */
public class Proyecto {

    private String nombre;
    private String duracionMin;

    public Proyecto(String nombre, String duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", duracionMin= " + duracionMin + '}';
    }

}

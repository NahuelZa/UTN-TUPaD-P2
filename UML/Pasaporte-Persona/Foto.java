/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uml;

/**
 *
 * @author nahue
 */
public class Foto {
    private String imagen;
    private String formato;

    public Foto(String imagen,String formato){
    this.imagen=imagen;
    this.formato=formato;
    
}

    @Override
    public String toString() {
        return "Foto{" + "imagen=" + imagen + ", formato=" + formato + '}';
    }
    
}

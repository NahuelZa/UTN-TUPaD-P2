/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figura;

/**
 *
 * @author nahue
 */
public abstract class Figura {
    private TipoFigura nombre;

    public Figura(TipoFigura nombre) {
        this.nombre = nombre;
    }

    public TipoFigura getNombre() {
        return nombre;
    }

   
    
    
    
    
    public abstract double calcularArea();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

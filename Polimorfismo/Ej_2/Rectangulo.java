/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figura;

/**
 *
 * @author nahue
 */
public class Rectangulo extends Figura{
    private double alto;
    private double ancho;

    public Rectangulo(double alto, double ancho, TipoFigura nombre) {
        super(nombre);
        this.alto = alto;
        this.ancho = ancho;
    }

    


    
    
    @Override  
    public double calcularArea(){
       return this.alto*2+this.ancho*2;
        
    };
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

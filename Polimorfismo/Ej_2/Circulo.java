/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figura;

/**
 *
 * @author nahue
 */
public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio, TipoFigura nombre) {
        super(nombre);
        this.radio = radio;
    }

    
 

  
    
    

    
    @Override  
    public double calcularArea(){
       return Math.PI * Math.pow(this.radio, 2);
        
    };

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

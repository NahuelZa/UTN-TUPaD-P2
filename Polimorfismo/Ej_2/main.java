/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figura;

import java.util.ArrayList;

/**
 *
 * @author nahue
 */
public class main {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Figura> figuras=new  ArrayList<>();        
        Circulo c1 = new Circulo(8,TipoFigura.CIRCULO);
        Circulo c2=new Circulo(8.5,TipoFigura.CIRCULO);
        Rectangulo r1=new Rectangulo (4,8,TipoFigura.RECTANGULO);
        Rectangulo r2=new Rectangulo (9.8,5.7,TipoFigura.RECTANGULO);
        
        figuras.add(c1);
        figuras.add(c2);
        figuras.add(r1);
        figuras.add(r2);
       
        for (Figura figura:figuras){
            System.out.print("Area del = " + figura.getNombre()+ " es igual a = " + figura.calcularArea() );
                    System.out.println(" ");   ;
            
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libro;

/**
 *
 * @author nahue
 */
public class main {

    
    public static void main(String[] args) {
        Autor Rolon=new Autor("Gabriel","Argentino");
        Editorial Planeta=new Editorial ("Planeta","Callao 1334");
        Libro HistoriasDivan=new Libro("Historias de un divan",4154711,Planeta);
        HistoriasDivan.setAutor(Rolon);
        System.out.println(HistoriasDivan);
    }
    
}

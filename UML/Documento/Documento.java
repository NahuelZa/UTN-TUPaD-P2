/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package documento;

/**
 *
 * @author nahue
 */
public class Documento {

    private String patente;
    private String modelo;
    private FirmaDigital firmadigital;
    
    
    public Documento(String patente,String modelo,String tipo,int numeroSerie,Usuario usario){
        this.patente=patente;
        this.modelo=modelo;
        this.firmadigital=new FirmaDigital(tipo,numeroSerie,usario);
        
    }

    @Override
    public String toString() {
        return "Documento{" + "patente=" + patente + ", modelo=" + modelo + ", firmadigital=" + firmadigital + '}';
    }

    

}

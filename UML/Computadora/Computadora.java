/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computadora;

/**
 *
 * @author nahue
 */
public class Computadora {

    private String computadora;
    private int numeroSerie;
    private Propietario propietario;
    private PlacaMadre placamadre;

    public Propietario getPropietario() {
        return propietario;
    }

    @Override
    public String toString() {
        return "Computadora{" + "computadora=" + computadora + ", numeroSerie=" + numeroSerie + ", propietario=" + propietario + ", placamadre=" + placamadre + '}';
    }

       
    
    public Computadora(String computadora, int numeroSerie,String modelo,String chipSet){
            this.computadora=computadora;
            this.numeroSerie=numeroSerie;
            this.placamadre=new PlacaMadre(modelo,chipSet);
            }
    
    
    
    public void setPopietario(Propietario propietario){
    this.propietario=propietario;
    if (propietario!=null && propietario.getComputadora()!=this){
        propietario.setComputadora(this);
    }
    
}
    
   
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculo;

/**
 *
 * @author nahue
 */
public class Motor {

   private String tipo;
   private int numeroSeria ;
   
   
   public Motor(String tipo,int numeroSerie){
       this.tipo=tipo;
       this.numeroSeria=numeroSerie;
   }

    @Override
    public String toString() {
        return "Motor{" + "tipo=" + tipo + ", numeroSeria=" + numeroSeria + '}';
    }
    
}

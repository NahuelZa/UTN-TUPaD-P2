/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package documento;

/**
 *
 * @author nahue
 */
public class FirmaDigital {

   private String tipo;
   private int numeroSerie;
   private Usuario usuario;
   
   
   public FirmaDigital(String tipo,int numeroSerie,Usuario usuario){
       this.numeroSerie=numeroSerie;
       this.tipo=tipo;
       this.usuario=usuario;
   }

    @Override
    public String toString() {
        return "FirmaDigital{" + "tipo=" + tipo + ", numeroSerie=" + numeroSerie + ", usuario=" + usuario + '}';
    }

  

    
   
    
}

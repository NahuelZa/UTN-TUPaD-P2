/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uml;

/**
 *
 * @author nahue
 */
public class Pasaporte {

    private int numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;

   public Pasaporte(int numero, String fechaEmision,String formato,String imagen){
       this.numero=numero;
       this.fechaEmision=fechaEmision;
       this.foto=new Foto(imagen,formato);
   }

    public Titular getTitular() {
        return titular;
    }

   
   public void setTitular(Titular titular){
       this.titular=titular;
       System.out.println(this);
       if(titular!=null && titular.getPasaporte()!=this){
           titular.setPasaporte(this);
       }
   }

    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero + ", fechaEmision=" + fechaEmision + ", foto=" + foto + ", " + titular + '}';
    }
   
   
   
   

 
    
   

}

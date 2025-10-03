/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleado;

/**
 *
 * @author nahue
 */
public  class EmpleadoTemporal extends Empleado{

    public EmpleadoTemporal(String nombre) {
        super(nombre);
    }

    

    @Override 
   public double calcularSueldo(){
       return 1240.5;
   }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleados;
import java.util.Random;
/**
 *
 * @author nahue
 */
public class Empleado {
    private static Random rand = new Random();    
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;
    
    
    
    public  Empleado(int id,String nombre,String puesto, double salario){        
        setId(id);
        SetNombre(nombre);
        this.puesto=puesto;
        this.salario=salario;
        totalEmpleados++;
    }
    
    private void setId(int id){
        if (id >0){
            this.id=id;
        }
        else{
            System.out.println("Numero no valido asiganod valor -1");
            this.id=-1;
            
        }
    }    
    
     private void SetNombre(String nombre){
        if (nombre!=null){
            this.nombre=nombre;
        }
        else{
            System.out.println("Nombre no puede estar vacio");      
                    }
    }
    
     
     public  Empleado(String nombre,String puesto){        
        this(rand.nextInt(50),nombre,puesto,1320.0);       
    }
    
    public void actualizarSalario (double porcentaje){
        this.salario=this.salario*(1+porcentaje/100);}
   
    public void actualizarSalario (){
        actualizarSalario(5);}
    
    
    @Override
    public String toString(){
        return "Empleados [nombre=" + nombre + ", id= " + id + ", puesto= "+ puesto + ", salario= "+ salario+"]";
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        // TODO code application logic here
        Empleado Empleado1=new Empleado(15,"","Barrendero",154);      
        Empleado Empleado2=new Empleado("Pedro","Panadero");
        System.out.println(Empleado2.id);
        
        System.out.println(Empleado2.salario);
        Empleado2.actualizarSalario(15);
        System.out.println(Empleado2.salario);
        
        Empleado2.actualizarSalario();
        System.out.println(Empleado2.salario);
        
        
        System.out.println(Empleado2);
        System.out.println(Empleado1);
        System.out.println("Total empleados= "+ totalEmpleados);
        Empleado Empleado3=new Empleado("Juan","Chofer");
        Empleado Empleado4=new Empleado("Leo","Limpieza");
        Empleado Empleado5=new Empleado("Julian","Programador");
        Empleado Empleado6=new Empleado("Debora","Barrendero");
        System.out.println("Total empleados= "+ totalEmpleados);
        
    }
    
}

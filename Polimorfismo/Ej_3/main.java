

import empleado.Empleado;
import empleado.EmpleadoPlanta;
import empleado.EmpleadoTemporal;





/**
 *
 * @author nahue
 */
public class main {

}
 public static void main(String[] args) {
ArrayList <Empleado> empleados=new ArrayList<>();
EmpleadoPlanta Jorge=new EmpleadoPlanta("Jorge");
EmpleadoPlanta Pedro=new EmpleadoPlanta("Pedro");
EmpleadoTemporal Miguel=new EmpleadoTemporal("Miguel");
EmpleadoTemporal Luis=new EmpleadoTemporal("Luis");
    
empleados.add(Jorge);
empleados.add(Pedro);
empleados.add(Miguel);
empleados.add(Luis);

for (Empleado empleado:empleados){
    System.out.println("Salario de "+ empleado.getNombre()+ "es de = " +  empleado.calcularSueldo());
}  

}

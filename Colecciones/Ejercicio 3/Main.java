/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package profesor;

/**
 *
 * @author nahue
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Universidad UBA=new Universidad("UBA");
        
        Profesor Julian=new Profesor("A1","Julian A","Biologia");
        Profesor Kirstin=new Profesor("E1","Kristin K","Ingles");
        Profesor Fede=new Profesor("Z1","Fede Z","Deporte");
        
        Curso Biologia1=new Curso("B1","Biologia 1");
        Curso Deporte2=new Curso("D2","Deporte 2");
        Curso Matematica1=new Curso("M1","Matematica 1");
        Curso Fisica1=new Curso("F1","Fisica 1");
        Curso Quimica2=new Curso("Q2","Quimica 2");
        
        Biologia1.agregarProfesor(Julian);
        Matematica1.agregarProfesor(Julian);
        Kirstin.agregarCurso(Fisica1);
        Fede.agregarCurso(Deporte2);
        Kirstin.agregarCurso(Quimica2);
        
        UBA.agregarCurso(Quimica2);
        UBA.agregarCurso(Biologia1);
        UBA.agregarCurso(Matematica1);
        UBA.agregarCurso(Fisica1);
        UBA.agregarCurso(Deporte2);
        
        UBA.agregarProfesor(Fede);
        UBA.agregarProfesor(Julian);
        UBA.agregarProfesor(Kirstin);
        
        
        UBA.listarCursos();
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        
        UBA.listarProfesores();
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println(UBA.buscarProfesorPorId("A1"));
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println(UBA.buscarCursoPorCodigo("F1"));
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");        
        UBA.eliminarCurso("F1");
        UBA.listarCursos();
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");        
        UBA.listarCursos();
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        UBA.buscarProfesorPorId("E1");
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        UBA.eliminarProfesor("Z1");        
        UBA.listarProfesores();
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println(Fede);
        
        /*
    .*/
        // TODO code application logic here
    }
    
}

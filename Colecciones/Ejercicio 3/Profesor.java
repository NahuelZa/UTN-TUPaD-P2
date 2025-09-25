/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package profesor;

import java.util.ArrayList;

/**
 *
 * @author nahue
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }
   
    
    public void agregarCurso(Curso curso){
        if(curso!=null && !cursos.contains(curso)){
            cursos.add(curso);            
        }
        if (curso.getProfesor()!=this){
            curso.setProfesor(this);
        }
    }   
    
      public ArrayList<Curso> getCursos() {
        return cursos;
    }

    @Override
    public String toString() {
     return "Profesor{" + "id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad + ", cursos=" + cursos + '}';   

    }
      
      
    
    public static void main(String[] args) {
        // TODO code application logic here
    }

  

    
    
}

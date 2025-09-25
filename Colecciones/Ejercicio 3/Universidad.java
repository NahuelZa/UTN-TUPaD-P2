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
public class Universidad {
    private String nombre;
    private ArrayList<Curso> cursos;
    private ArrayList<Profesor>profesores;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
        this.profesores = new ArrayList<>();
    }
    void agregarCurso(Curso cursos){
        this.cursos.add(cursos);
    }
        
    void agregarProfesor(Profesor profesor){
        profesores.add(profesor);
    }
    void listarProfesores(){
        for (Profesor profesor:profesores){
            System.out.println(profesor);
        }
    }    
    void listarCursos(){
        for (Curso curso:cursos){
            System.out.println(curso);
        }
    }
        public Profesor buscarProfesorPorId(String id){
            int i = 0;
            Profesor encontrado=null;
            while(i<profesores.size() && profesores.get(i).getId()!=id){
                i++;}
            
                if(i<profesores.size()){
                    encontrado=profesores.get(i);             
                }
                else{
                    System.out.println("No se encontro");
                }
                return encontrado;
            
        }  
        
        public Curso  buscarCursoPorCodigo(String codigo){
            int i = 0;
            Curso encontrado=null;
            while(i<cursos.size() && !cursos.get(i).getCodigo().equals(codigo)){
                i++;}            
                if(i<cursos.size()){
                    encontrado=cursos.get(i);                    
                }
                else{
                    System.out.println("No se encontro");
                }
            return encontrado;
        }  
           
        void eliminarCurso(String codigo){
            Curso encontrado= buscarCursoPorCodigo(codigo);
            if (encontrado!=null){
                encontrado.getProfesor().getCursos().remove(encontrado);
                encontrado.setProfesor(null);
                
                cursos.remove(encontrado);
                
            }
            
        }
           void eliminarProfesor(String id){
            Profesor encontrado= buscarProfesorPorId(id);
            if (encontrado!=null){
                encontrado.setCursos(null);
                profesores.remove(encontrado);
                
            }
            
        }
        
        
        
        }
        
        
        
        
    



   /* 
    
    buscarCursoPorCodigo(String codigo)
    eliminarCurso(String codigo) → Debe romper la relación con su profesor
    si la hubiera.
    eliminarProfesor(String id) → Antes de remover, dejar null los cursos que
    dictaba.*/    
    
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package profesor;

/**
 *
 * @author nahue
 */
public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;

    }

    public String getCodigo() {
        return codigo;
    }
    
    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void agregarProfesor(Profesor profesor) {
        if (profesor != null && this.profesor != profesor) {
            this.profesor = profesor;
        }
        if (!profesor.getCursos().contains(this) && this != null) {
            profesor.agregarCurso(this);
        }
    }

    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", nombre=" + nombre + ", profesor=" + profesor.getNombre() + '}';
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}

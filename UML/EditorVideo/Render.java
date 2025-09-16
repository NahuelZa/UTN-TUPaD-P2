/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package editorvideo;

/**
 *
 * @author nahue
 */
public class Render {

    private String formato;
    private Proyecto proyecto;

    public Render(String formato, Proyecto proyecto) {
        setFormato(formato);
        setProyecto(proyecto);
    }

    public void setFormato(String formato) {
        if (formato != null) {
            this.formato = formato;
        }
    }

    public void setProyecto(Proyecto proyecto) {
        if (proyecto != null) {
            this.proyecto = proyecto;
        }
    }

    public String getFormato() {
        return formato;
    }

    public Proyecto getProyecto() {
        return proyecto;

    }

    @Override
    public String toString() {
        return "Render{" + "formato=" + formato + ", proyecto=" + proyecto + '}';
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}

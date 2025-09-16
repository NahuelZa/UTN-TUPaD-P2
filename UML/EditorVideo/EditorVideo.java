/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package editorvideo;

/**
 *
 * @author nahue
 */
public class EditorVideo {
    void exportar(String formato, Proyecto proyecto){
        Render xx = new Render(formato, proyecto); 
        System.out.println(xx);
        System.out.println ( xx.getProyecto() + " con formato " + xx.getFormato()+ " exportado con exito ");

}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Proyecto A45=new Proyecto ("Globos","15 min");
        EditorVideo CapCut=new EditorVideo();
        CapCut.exportar("mp4", A45);
        
        
        
    }

}

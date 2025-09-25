/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package producto;

/**
 *
 * @author nahue
 */
public enum CategoriaProducto {
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");

    private final String descripcion;

    CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }
    public static void mostrarCategoriasDisponibles(){
        for(CategoriaProducto  categorias:CategoriaProducto.values()){
            System.out.println(categorias);
        }
    };
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Categoria: "+ name() +" "+ descripcion + '}';
    }

   

   

}

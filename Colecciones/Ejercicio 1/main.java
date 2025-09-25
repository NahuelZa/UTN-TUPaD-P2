/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package producto;

/**
 *
 * @author nahue
 */
public class main {

    public static void main(String[] args) {
         
        Inventario a1= new Inventario("a1");     
        a1.agregarProducto( new Producto("Adaptador","Bosch",500,75,CategoriaProducto.ELECTRONICA));
        a1.agregarProducto( new Producto("Campera","Prada",3500,150,CategoriaProducto.ROPA));
        a1.agregarProducto(new Producto("Pan","La Princesa",250,150,CategoriaProducto.ALIMENTOS));       
        a1.agregarProducto(new Producto("Encendedor","Maria",200,250,CategoriaProducto.HOGAR));
        a1.agregarProducto(new Producto("Leche","Serenisima",1500,50,CategoriaProducto.ALIMENTOS));
              
        
       /* a1.listarProductos();
        
        System.out.println(a1.buscarProductoPorId("Pan"));
        
        a1.eliminarProducto("Leche");
    
        a1.actualizarStock("Leche", 50);
    
        a1.filtroCat(CategoriaProducto.ALIMENTOS);
      
        a1.obtenerTotalStock("Leche");
       
       a1.obtenerProductoConMayorStock();
  
       a1.filtrarProductosPorPrecio(200,250);*/
   

    CategoriaProducto.mostrarCategoriasDisponibles();

   



    


}
    

}

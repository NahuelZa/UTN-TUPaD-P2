/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package producto;

import java.util.ArrayList;

/**
 *
 * @author nahue
 */
public class Inventario {

    private String ID;
    private ArrayList<Producto> productos;

    public Inventario(String ID) {
        this.ID = ID;
        this.productos = new ArrayList<>();

    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void listarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }

    }

    ;
    
     public Producto buscarProductoPorId(String id) {
        int i = 0;
        Producto encontrado = null;
        while (i < productos.size() && !productos.get(i).getId().equals(id)) {
            i++;
        }
        if (i < productos.size()) {
            encontrado = productos.get(i);
        } else {
            System.out.println("No se encontro el producto");
        }
        return encontrado;
    }

    public void eliminarProducto(String id) {
        Producto insBorrar = buscarProductoPorId(id);
        if (insBorrar != null) {
            productos.remove(insBorrar);
            System.out.println("Producto: " + insBorrar + " Borrado");
        }

    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto actProd = buscarProductoPorId(id);
        if (actProd != null) {
            actProd.setCantidad(actProd.getCantidad() + nuevaCantidad);
            System.out.println("Nuevo stock de: " + actProd + actProd.getCantidad());
        }
    }

    ;      
    void filtroCat(CategoriaProducto categoria) {
        ArrayList<Producto> categorias = new ArrayList<>();
        for (Producto productos : productos) {
            if (productos.getCategoria() == categoria) {
                categorias.add(productos);

            }

        }
        System.out.println(categorias);

    }

    public void obtenerTotalStock(String id) {
        Producto actProd = buscarProductoPorId(id);
        if (actProd != null) {
            System.out.println("EL stock total de " + actProd.getId() + " es " + actProd.getCantidad());
        }
    }

    public void obtenerProductoConMayorStock() {
        int mayorStock=0;
        Producto productoMayorStock=null;
        for (Producto productos : productos) {
            if(productos.getCantidad()>mayorStock){
                mayorStock=productos.getCantidad();
                productoMayorStock=productos;            
        }
        }
        System.out.println(productoMayorStock);
    }

    ;
    
    public void filtrarProductosPorPrecio(double min, double max){        
        ArrayList<Producto> ProdPrecios = new ArrayList<>();
        for (Producto productos : productos) {
            if (productos.getPrecio() >=min && productos.getPrecio()<=max) {
                ProdPrecios.add(productos);

            }

        }
        System.out.println(ProdPrecios);

    
    };
    
    @Override
    public String toString() {
        return "Inventario{" + "ID=" + ID + ", productos=" + productos + '}';
    }

}

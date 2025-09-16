/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generadorqr;

/**
 *
 * @author nahue
 */
public class CodigoQR {
private int valor;
private Usuario usuario;

    public CodigoQR(int valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    public int getValor() {
        return valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }



    
}

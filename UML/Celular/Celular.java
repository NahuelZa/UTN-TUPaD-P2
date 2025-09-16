/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package celular;

/**
 *
 * @author nahue
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }
    
    
    
    public Celular(String imei, String marca,String modelo,Bateria bateria){
        this.imei=imei;
        this.marca=marca;
        this.modelo=modelo;
        this.bateria=bateria;
    }

    public void setUsuario(Usuario usuario){
        this.usuario=usuario;
        if(usuario!=null && usuario.getCelular()!=this){
            usuario.setCelular(this);
        }
    }

    @Override
    public String toString() {
        return "Celular{" + "imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + ", bateria=" + bateria + ", usuario=" + usuario + '}';
    }
    
}

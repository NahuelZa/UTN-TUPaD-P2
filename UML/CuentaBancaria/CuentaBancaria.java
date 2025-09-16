/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentabancaria;

/**
 *
 * @author nahue
 */
public class CuentaBancaria {

    private int cbu;
    private double saldo;
    private Titular titular;
    private ClaveSeguridad claveseguridad;

    public CuentaBancaria(int cbu, double saldo, int codigo, String ultimamodificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveseguridad = new ClaveSeguridad(codigo, ultimamodificacion);
    }

    void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuentabancaria() !=this) {
            titular.setCuentabancaria(this);
        }
    }

    public Titular getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", titular=" + titular + ", claveseguridad=" + claveseguridad + '}';
    }

}

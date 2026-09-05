/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.ejercicio6;

/**
 *
 * @author frank
 */

public class Cuenta {

    private String titular;
    private double saldo;

    // Constructor
    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Getter titular
    public String getTitular() {
        return titular;
    }

    // Setter titular
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Getter saldo
    public double getSaldo() {
        return saldo;
    }

    // Setter saldo
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Mostrar informacion
    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: S/ " + saldo);
    }

    // Calcular beneficio
    public double calcularBeneficio() {
        return 0;
    }
}
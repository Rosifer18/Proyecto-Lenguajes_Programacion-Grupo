/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.ejercicio6;

/**
 *
 * @author frank
 */

public class CuentaAhorro extends Cuenta {

    private double tasaInteres;

    // Constructor
    public CuentaAhorro(String titular, double saldo, double tasaInteres) {
        super(titular, saldo);
        this.tasaInteres = tasaInteres;
    }

    // Getter tasaInteres
    public double getTasaInteres() {
        return tasaInteres;
    }

    // Setter tasaInteres
    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    // Sobrescribir calcularBeneficio
    @Override
    public double calcularBeneficio() {
        return getSaldo() * tasaInteres / 100;
    }

    // Mostrar informacion
    @Override
    public void mostrarInformacion() {
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: S/ " + getSaldo());
        System.out.println("Tasa de interes: " + tasaInteres + "%");
    }
}

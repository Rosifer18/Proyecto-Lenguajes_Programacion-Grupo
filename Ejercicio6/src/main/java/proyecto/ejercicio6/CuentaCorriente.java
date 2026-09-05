/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.ejercicio6;

/**
 *
 * @author frank
 */

public class CuentaCorriente extends Cuenta {

    private double comision;

    // Constructor
    public CuentaCorriente(String titular, double saldo, double comision) {
        super(titular, saldo);
        this.comision = comision;
    }

    // Getter comision
    public double getComision() {
        return comision;
    }

    // Setter comision
    public void setComision(double comision) {
        this.comision = comision;
    }

    // Sobrescribir calcularBeneficio
    @Override
    public double calcularBeneficio() {
        return -comision;
    }

    // Mostrar informacion
    @Override
    public void mostrarInformacion() {
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: S/ " + getSaldo());
        System.out.println("Comision: S/ " + comision);
    }
}
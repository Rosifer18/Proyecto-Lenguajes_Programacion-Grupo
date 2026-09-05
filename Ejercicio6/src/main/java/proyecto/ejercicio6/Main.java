/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package proyecto.ejercicio6;

/**
 *
 * @author frank
 */

public class Main {

    public static void main(String[] args) {

        // Crear una cuenta de ahorro
        CuentaAhorro ahorro = new CuentaAhorro(
                "Carlos",
                5000.00,
                5.0
        );

        // Crear una cuenta corriente
        CuentaCorriente corriente = new CuentaCorriente(
                "Luis",
                3000.00,
                25.00
        );

        // Mostrar informacion de las cuentas
        System.out.println("===== CUENTA DE AHORRO =====");
        ahorro.mostrarInformacion();

        System.out.println("Beneficio: S/ " + ahorro.calcularBeneficio());

        System.out.println();

        System.out.println("===== CUENTA CORRIENTE =====");
        corriente.mostrarInformacion();

        System.out.println("Beneficio: S/ " + corriente.calcularBeneficio());

        // Modificar un valor mediante un setter
        ahorro.setSaldo(6000.00);

        System.out.println();
        System.out.println("===== DATOS MODIFICADOS =====");
        ahorro.mostrarInformacion();

        // Crear referencias de tipo Cuenta
        Cuenta cuenta1 = ahorro;
        Cuenta cuenta2 = corriente;

        System.out.println();
        System.out.println("===== POLIMORFISMO =====");

        cuenta1.mostrarInformacion();
        System.out.println("Beneficio: S/ " + cuenta1.calcularBeneficio());

        System.out.println();

        cuenta2.mostrarInformacion();
        System.out.println("Beneficio: S/ " + cuenta2.calcularBeneficio());
    }
}

  
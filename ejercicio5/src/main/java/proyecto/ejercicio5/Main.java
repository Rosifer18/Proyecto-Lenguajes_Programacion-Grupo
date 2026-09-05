/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package proyecto.ejercicio5;

/**
 *
 * @author frank
 */

public class Main {

    public static void main(String[] args) {

        // Crear objeto Persona
        Persona persona = new Persona("Carlos", 30);

        // Crear objeto Empleado
        Empleado empleado = new Empleado("Luis", 35, 2500.00);

        // Crear objeto Gerente
        Gerente gerente = new Gerente(
                "Ana",
                40,
                5000.00,
                "Administracion"
        );

        // Mostrar informacion
        System.out.println("===== PERSONA =====");
        persona.mostrarInformacion();

        System.out.println("\n===== EMPLEADO =====");
        empleado.mostrarInformacion();

        System.out.println("\n===== GERENTE =====");
        gerente.mostrarInformacion();

        // Modificar datos utilizando setters
        persona.setNombre("Pedro");
        persona.setEdad(31);

        empleado.setSueldo(3000.00);

        gerente.setArea("Recursos Humanos");

        // Mostrar datos modificados
        System.out.println("\n===== DATOS MODIFICADOS =====");

        persona.mostrarInformacion();

        empleado.mostrarInformacion();

        gerente.mostrarInformacion();

        // Polimorfismo
        Persona referencia1 = empleado;
        Persona referencia2 = gerente;

        System.out.println("\n===== POLIMORFISMO =====");

        referencia1.mostrarInformacion();

        referencia2.mostrarInformacion();
    }
}
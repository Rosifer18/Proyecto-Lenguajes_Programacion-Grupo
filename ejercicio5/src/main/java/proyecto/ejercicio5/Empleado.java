/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.ejercicio5;

/**
 *
 * @author frank
 */

public class Empleado extends Persona {

    private double sueldo;

    // Constructor
    public Empleado(String nombre, int edad, double sueldo) {
        super(nombre, edad);
        this.sueldo = sueldo;
    }

    // Getter sueldo
    public double getSueldo() {
        return sueldo;
    }

    // Setter sueldo
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // Sobrescribir mostrarInformacion
    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Sueldo: S/ " + sueldo);
    }
}
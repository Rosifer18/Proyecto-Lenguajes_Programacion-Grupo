/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.ejercicio5;

/**
 *
 * @author frank
 */

public class Gerente extends Empleado {

    private String area;

    // Constructor
    public Gerente(String nombre, int edad, double sueldo, String area) {
        super(nombre, edad, sueldo);
        this.area = area;
    }

    // Getter area
    public String getArea() {
        return area;
    }

    // Setter area
    public void setArea(String area) {
        this.area = area;
    }

    // Sobrescribir mostrarInformacion
    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Sueldo: S/ " + getSueldo());
        System.out.println("Area: " + area);
    }
}
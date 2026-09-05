/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6conversiontemperatura;

/**
 *
 * @author Frank 
 */

import java.util.Scanner;

public class Ejercicio6ConversionTemperatura {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.print("Ingrese la temperatura en Celsius: ");
        celsius = entrada.nextDouble();

        fahrenheit = 1.8 * celsius + 32;

        System.out.println("Temperatura en Fahrenheit: " + fahrenheit);
    }
}
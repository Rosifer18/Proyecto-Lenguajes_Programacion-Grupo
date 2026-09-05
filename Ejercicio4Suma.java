/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4suma;

/**
 *
 * @author Frank
 */

import java.util.Scanner;

public class Ejercicio4Suma {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int N;
        int suma;

        System.out.print("Ingrese el valor de N: ");
        N = entrada.nextInt();

        suma = N * (N + 1) / 2;

        System.out.println("La suma es: " + suma);
    }
}
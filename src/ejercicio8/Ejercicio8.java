
package ejercicio8;
import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Ingrese lado A: ");
       double a = sc.nextDouble();
       
       System.out.print("Ingrese lado B: ");
       double b = sc.nextDouble();
       
       System.out.print("Ingrese lado C: ");
       double c = sc.nextDouble();
       //SALIDAS
       double p = (a + b + c) / 2;
       System.out.println("El perímetro es: " + (a + b + c));
       System.out.println("El semiperímetro es: " + p);
       double area = Math.sqrt(p * (p - a) * (p-b)* (p - c));
       System.out.println("El área del triángulo es: " + area);
       
    }
    
}

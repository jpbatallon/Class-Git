package Ejercicio_1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        //Sacar área y perímetro de un rectángulo.

        Scanner scanner = new Scanner(System.in);
/*
        System.out.println("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();

        System.out.println("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        var area = base * altura;
        System.out.println("El área del rectángulo es: " + area);

        var perimetro = 2 * (base + altura);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
*/

        //El mayor de dos números (Operador Ternario)

        System.out.println("Ingrese un número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese otro número: ");
        double num2 = scanner.nextDouble();

        var mayor = num1 > num2 ? "El número " + num1 + " es mayor" : "El número " + num2 + " es mayor";
        System.out.println("mayor = " + mayor);
    }
}

package Ejercicio_1;

import java.util.Scanner;

public class Clase11 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
/*
        //Determinar si un alumno aprueba o no un curso, sabiendo que aprobará si su
        //promedio de tres calificaciones es mayor o igual a 70, reprueba caso contrario.

        System.out.println("Ingrese la nota de la primer calificación: ");
        double nota1 = Double.parseDouble(entrada.next());
        System.out.println("Ingrese la nota de la segunda calificación: ");
        double nota2 = Double.parseDouble(entrada.next());
        System.out.println("Ingrese la nota de la tercera calificación: ");
        double nota3 = Double.parseDouble(entrada.next());

        var resultado = (nota1 + nota2 + nota3) / 3;

        if (resultado >= 70)
            System.out.println("El alumno está aprobado con: " + resultado);
        else
            System.out.println("El alumno está desaprobado con: " + resultado);
*/
/*
        //En un almacen se hace un 20% de descuento a los clientes cuya compra
        //supere los 100 USD. ¿Cuál será la cantidad que pagará una persona por su compra?

        System.out.println("Ingrese la cantidad a pagar del producto: ");
        double precio = Double.parseDouble(entrada.next());

        var descuento = precio - (precio * 0.2);

        if (precio >= 100) {
            System.out.println("Se le aplica el descuento, deberá pagar: " + descuento);
        }
        else {
            System.out.println("No se le aplica el descuento, deberá pagar: " + precio);
        }
*/

        //Leer 2 números; si son iguales, que los multiplique, si el primero es mayor
        //que el segundo, que los reste y sino que los sume.

        System.out.println("Ingrese un número: ");
        var num1 = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese otro número: ");
        var num2 = Integer.parseInt(entrada.nextLine());

        if (num1 == num2) {
            var resultado = (num1 * num2);
            System.out.println("El resultado es: " + resultado);
        } else if (num1 > num2) {
            var resultado = (num1 - num2);
            System.out.println("El resultado es: " + resultado);
        } else {
                var resultado = (num1 + num2);
                System.out.println("El resultado es: " + resultado);
            }
    }
}

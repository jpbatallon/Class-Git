package Leccion1;

import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
       /* System.out.println("Hola Mundo desde Java");

        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);

        String miVariableCadena = "Bienvenidos.";
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en programación.";
        System.out.println(miVariableCadena);
*/
/*
        var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);

        var usuario = "Pedro";
        var titulo = "Licenciado";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        var a = 7;
        var b = 9;
        System.out.println(usuario + (a + b));
*/
/*
        var nombre = "Roberto";
        System.out.println("\nNueva línea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Tabulador x2: \t\t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Comillas simples: \'" + nombre + "\'");
        System.out.println("Comillas dobles: \"" + nombre + "\"");
*/
/*
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba su título o profesión: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: " + titulo2 + " " + usuario2);

        System.out.println("Escriba el título del libro: ");
        var titulo = entrada.nextLine();
        System.out.println("Escriba el nombre del autor: ");
        var autor = entrada.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
 */
/*
        byte numeroEnteroByte = 127;
        System.out.println("numeroEnteroByte = " + numeroEnteroByte);
        System.out.println("Valor mínimo del Byte: " + Byte.MIN_VALUE);
        System.out.println("Valor máximo del Byte: " + Byte.MAX_VALUE);

        short numeroEnteroShort = 32767;
        System.out.println("numeroEnteroShort = " + numeroEnteroShort);
        System.out.println("Valor mínimo del Short: " + Short.MIN_VALUE);
        System.out.println("Valor máximo del Short: " + Short.MAX_VALUE);

        int numeroEnteroInt = 2147483647;
        System.out.println("numeroEnteroInt = " + numeroEnteroInt);
        System.out.println("Valor mínimo del Int: " + Integer.MIN_VALUE);
        System.out.println("Valor máximo del Int: " + Integer.MAX_VALUE);

        long numeroEnteroLong = 9223372036854775807L;
        System.out.println("numeroEnteroLong = " + numeroEnteroLong);
        System.out.println("Valor mínimo del Long: " + Long.MIN_VALUE);
        System.out.println("Valor máximo del Long: " + Long.MAX_VALUE);
*/
/*
        float numFloat = 3.4028235E38F;
        System.out.println("numFloat = " + numFloat);
        System.out.println("El número mínimo de Float es: " + Float.MIN_VALUE);
        System.out.println("El número máximo de Float es: " + Float.MAX_VALUE);

        double numDouble = 1.7976931348623157E308;
        System.out.println("numDouble = " + numDouble);
        System.out.println("El número mínimo de Double es: " + Double.MIN_VALUE);
        System.out.println("El número máximo de Double es: " + Double.MAX_VALUE);
*/
/*
        var numEntero = 20;
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0;
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);

*/
/*
        char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);

        char varCaracter = '\u0024';
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterDecimal = 36;
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo = '$';
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);

        var varCaracter2 = '\u0024';
        System.out.println("varCaracter2 = " + varCaracter2);
        var varCaracterDecimal2 = (char)36;
        System.out.println("varCaracterDecimal2 = " + varCaracterDecimal2);
        var varCaracterSimbolo2 = '$';
        System.out.println("varCaracterSimbolo2 = " + varCaracterSimbolo2);

        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 'B';
        System.out.println("caracterChar = " + caracterChar);
*/
/*
        boolean varBool = true;
        System.out.println("varBool = " + varBool);

        if(varBool) {
            System.out.println("La bandera es verde.");
        }
        else{
                System.out.println("La bandera es roja.");
            }

        var edad = 33;
        if (edad >=18){
            System.out.println("Eres mayor de edad.");
        }
        else{
            System.out.println("Eres menor de edad.");
        }
*/
/*
        var edad = Integer.parseInt("20");
        System.out.println("edad= " + (edad + 1));
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("doublePI = " + valorPI);

        var entrada = new Scanner(System.in);
        System.out.println("Escriba su edad: ");
        edad = Integer.parseInt(entrada.nextLine());
        System.out.println("Edad: " + edad);
*/
/*
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);

        var fraseChar = "HolaMundo".charAt(4);
        System.out.println("fraseChar = " + fraseChar);

        var entrada = new Scanner(System.in);
        System.out.println("Escriba un caracter: ");
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);
*/
/*
        int num1 = 7, num2 = 8;
        var respuesta = num1 + num2;
        System.out.println("La respuesta de la suma es: " + respuesta);

        respuesta = num1 - num2;
        System.out.println("La respuesta de la resta es: " + respuesta);

        respuesta = num1 * num2;
        System.out.println("La respuesta de la multiplicación es: " + respuesta);

        respuesta = num1 / num2;
        System.out.println("La respuesta de la división es: " + respuesta);

        var respuesta2 = 3.90 / num2;
        System.out.println("La respuesta2 de la división es: " + respuesta2);

        respuesta = num1 % num2;
        System.out.println("El residuo de la división es: " + respuesta);

        if (num1 % 2 == 0)
             System.out.println("El número ingresado es par.");
        else
             System.out.println("El número ingresado es impar.");
*/
/*
      // -=     +=      /=      %=      *=
        int varNum1 = 1, varNum2 = 4;
        var varNum3 = varNum1 + 6 - varNum2;
        System.out.println("varNum3 = " + varNum3);

        varNum1 += 1;
        System.out.println("varNum1 = " + varNum1);

        varNum2 -= 2;
        System.out.println("varNum2 = " + varNum2);

        varNum2 /= 2;
        System.out.println("varNum2 = " + varNum2);

        varNum3 *= 3;
        System.out.println("varNum3 = " + varNum3);

        varNum1 %= 6;
        System.out.println("varNum1 = " + varNum1);
*/
/*
        //Operadores unarios: Cambio de signo
        var varA = 10;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);  //El resultado será un número negativo.

        //Operador de negación
        var varC = true;
        var varD = !varC;   //Acá invierte el valor.
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);

        //Operador unarios de incremento: Preincremento
        var varE = 9;   //Se va a cambiar el valor.
        var varF = ++varE;   //Símbolo antes de la variable.
                             //Primero se incrementa la variable y luego se usa su valor.
        System.out.println("varE = " + varE);
        System.out.println("varF = " + varF);

        //Postincremento (El símbolo va después de la variable)
        var varG = 15;
        var varH = varG++;
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);

        //Operadores unarios de decremento: Predecremento
        var varI = 5;
        var varJ = --varI;
        System.out.println("varI = " + varI);
        System.out.println("varJ = " + varJ);

        //Postdecremento
        var varK = 7;
        var varL = varK--;
        System.out.println("varK = " + varK);
        System.out.println("varL = " + varL);
*/
/*
        //Operadores de Igualdad y Relacionales
        var aNum = 5;
        var bNum = 7;
        var cNum = aNum == bNum;
        System.out.println("cNum = " + cNum);

        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);

        var cadenaA = "Hello";
        var cadenaB = "World";
        var cVar = cadenaA == cadenaB;
        System.out.println("cVar = " + cVar);

        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);

        var gVar = aNum >= bNum; //>, >=, <, <=, !=, ==
        System.out.println("gVar = " + gVar);

        if (aNum % 2 == 0){
            System.out.println("El número es par.");
        } else{
            System.out.println("El número es impar.");
        }

        var edad = 40;
        var adulto = 18;
        if (edad >= adulto){
            System.out.println("Es mayor de edad.");
        } else{
            System.out.println("No es mayor de edad.");
        }
*/
/*
        //Operadores condicionales (and (&&) y or (||))
        var valorA = 8;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10;

        if(respuesta)
            System.out.println("Está dentro del rango establecido");
        else
            System.out.println("Está fuera del rango establecido.");

        var vacaciones = false;
        var diaLibre = false;
        if (vacaciones || diaLibre)
            System.out.println("Papá puede asistir al juego de su hijo.");
        else
            System.out.println("El papá no puede asistir al juego de su hijo.");
*/
/*
        //Operador ternario
        var resultadoT = (4 > 9) ? "Verdadero" : "Falso";
        System.out.println("resultadoT = " + resultadoT);

        var numeroT = 6;
        resultadoT = (numeroT % 2 == 0) ? "Es par." : "Es impar.";
        System.out.println("resultadoT = " + resultadoT);
*/
/*
        var x = 7;
        var y = 9;
        var z = ++x + y--;
        System.out.println("x = " + x);  //8
        System.out.println("y = " + y);  //8
        System.out.println("z = " + z);  //17

        var solucionAritmetica = 7 + 10 * 3 / 5;   // 7 + ((10 * 3) / 5) = 30 / 5 = 6 + 7 = 13
        System.out.println("solucionAritmetica = " + solucionAritmetica);

        solucionAritmetica = (7+8) * 3 / 5;   // 7 + 8 = 15 * 3 = 45 / 5 = 9
        System.out.println("solucionAritmetica = " + solucionAritmetica);
*/
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subprogramas.guía_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio_1 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.println("\nIngrese dos números por pantalla: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("\nIngrese una opción para operar:"
                + "\n1.Sumar"
                + "\n2.Restar"
                + "\n3.Multiplicar"
                + "\n4.Dividir"
                + "\n5. Salir\n");

        int opcion = input.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("La suma de los números es: " + FuncionSumar(num1, num2));
                break;
            case 2:
                System.out.println("La resta de los dos números es: " + FuncionRestar(num1, num2));
                break;
            case 3:
                System.out.println("La multiplicación de los números ingresados es: " + FuncionMultiplicar(num1, num2));
                break;
            case 4:
                System.out.println("La división de los números ingresados es: " + FuncionDividir(num1, num2));
                break;
            case 5:
                System.out.println("Gracias por usar nuestros servicios.");
                break;
            default:
                System.out.println("OPCIÓN INGRESADA ES INCORRECTO");
                

        }

    }

    public static int FuncionSumar(int num1, int num2) {
        return num1 + num2;

    }

    public static int FuncionRestar(int num1, int num2) {

        return num1 - num2;

    }

    public static int FuncionMultiplicar(int num1, int num2) {

        return num1 * num2;

    }

    public static int FuncionDividir(int num1, int num2) {
        int varDivision = num1/num2; 
        return varDivision;
    }
}


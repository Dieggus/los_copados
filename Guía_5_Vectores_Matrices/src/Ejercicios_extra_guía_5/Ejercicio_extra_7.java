/*
Realizar un programa que complete un vector con los N primeros números de la sucesión de Fibonacci. 
Recordar que la sucesión de Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba 
como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.

 */
package Ejercicios_extra_guía_5;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio_extra_7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el tamaño N del vector");

        int n = input.nextInt();
        
        int[] vector = fillFibonacci(n);

        System.out.print("La serie de Fibonacci con los " + n + " primeros términos es: ");

        // imprimir la serie
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println(" ");
    }

    public static int[] fillFibonacci(int n) {
        int[] aureo = new int[n];

        aureo[0] = 0;
        aureo[1] = 1;

        // calcular el resto de la serie
        for (int i = 2; i < n; i++) {
            aureo[i] = aureo[i - 1] + aureo[i - 2];
        }

        return aureo;
    }
}

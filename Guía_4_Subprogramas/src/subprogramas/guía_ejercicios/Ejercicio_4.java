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
public class Ejercicio_4 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero = sc.nextInt();

        boolean esPrimo = esNumeroPrimo(numero);

        if (esPrimo) {
            System.out.printf("%d es un número primo.\n", numero);
        } else {
            System.out.printf("%d no es un número primo.\n", numero);
        }
    }

    public static boolean esNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}


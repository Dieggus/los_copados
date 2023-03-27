/*
 Realice un programa que compruebe si una matriz dada es antisimétrica. 
 Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo. 
Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando 
sus filas por columnas (o viceversa).

 */
package Ejercicios_Guía_5;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int matriz[][] = new int[3][3];
        int matrizT[][] = new int[3][3];

        System.out.println("\nIngrese los valores de la matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = input.nextInt();
            }
        }
        System.out.println("Matriz Original");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizT[j][i] = matriz[i][j];
            }
        }
        System.out.println("Matriz Traspuesta");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        
          if (esAntisimetrica(matriz)) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz NO es antisimétrica");
        }
    }

    private static boolean esAntisimetrica(int[][] matriz) {
      // Comprobar si la matriz es cuadrada
        if (matriz.length != matriz[0].length) {
            return false;
        }
        
        // Comprobar si la matriz es antisimétrica
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    return false;
                }
            }
        }
        
        return true;
    }
}

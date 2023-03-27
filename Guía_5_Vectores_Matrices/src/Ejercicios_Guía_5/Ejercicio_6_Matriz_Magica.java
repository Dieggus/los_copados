/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Guía_5;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio_6_Matriz_Magica {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        boolean esCuadradoMagico = true;
        int sumaFila1 = 0, sumaFila2 = 0, sumaFila3 = 0;
        int sumaColumna1 = 0, sumaColumna2 = 0, sumaColumna3 = 0;
        int sumaDiagonal1 = 0, sumaDiagonal2 = 0;

        System.out.println("Introduce los números del cuadrado mágico (del 1 al 9):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = input.nextInt();
                if (matriz[i][j] < 1 || matriz[i][j] > 9) {
                    System.out.println("Error: los números deben estar entre 1 y 9.");
                    return;
                }
            }
        }
        //Imprimir la matriz
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 System.out.print("["+matriz[i][j]+"]");
             }
             System.out.println(" ");
         }
    

        // Sumar las filas, columnas y diagonales
        for (int i = 0; i < 3; i++) {
            sumaFila1 += matriz[0][i];
            sumaFila2 += matriz[1][i];
            sumaFila3 += matriz[2][i];

            sumaColumna1 += matriz[i][0];
            sumaColumna2 += matriz[i][1];
            sumaColumna3 += matriz[i][2];

            sumaDiagonal1 += matriz[i][i];
            sumaDiagonal2 += matriz[i][2-i];
        }

        // Verificar si las sumas son iguales
        int suma = sumaFila1;
        if (suma != sumaFila2 || suma != sumaFila3 || suma != sumaColumna1 || suma != sumaColumna2 || suma != sumaColumna3 || suma != sumaDiagonal1 || suma != sumaDiagonal2) {
            esCuadradoMagico = false;
        }

        if (esCuadradoMagico) {
            System.out.println("El cuadrado introducido es mágico.");
        } else {
            System.out.println("El cuadrado introducido NO es mágico.");
        }
    }
}

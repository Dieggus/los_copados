/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz. 
 La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package Ejercicios_Guía_5;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int matriz[][] = new int [4] [4];
        int matrizT[][] = new int [4] [4];
        System.out.println("\nIngrese los valores de la matriz: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = input.nextInt();
            }
        }
        System.out.println("Matriz Original");
         for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
             System.out.println(" ");
        }
         System.out.println(" ");

          for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizT[j][i] = matriz[i][j];
            }
        }
         System.out.println("Matriz Traspuesta");
         for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+matriz[j][i]+"]");
            }
             System.out.println(" ");
        }
    }
}

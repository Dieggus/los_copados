/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercices;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio01 {
     public static void main(String[] args) {
        // TODO code application logic her
        Scanner leer = new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingrese los numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        System.out.println("La suma de los numeros es: " + (num1 + num2));
    }
}

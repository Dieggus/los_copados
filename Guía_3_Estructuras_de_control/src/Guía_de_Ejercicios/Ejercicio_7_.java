/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guía_de_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio_7_ {
    
    public static void main(String[] args){
   
        Scanner scanner = new Scanner(System.in);
        String cadena;
        int correctas = 0, incorrectas = 0;

        do {
            System.out.print("Ingrese una cadena (&&&&& para salir): ");
            cadena = scanner.nextLine();

            if (cadena.equals("&&&&&")) {
                break;
            }

            if (cadena.length() == 5 && cadena.charAt(0) == 'X' && cadena.charAt(4) == 'O') {
                correctas++;
            } else {
                incorrectas++;
            }

        } while (true);

        System.out.println("\nInforme:");
        System.out.println("Cantidad de lecturas correctas: " + correctas);
        System.out.println("Cantidad de lecturas incorrectas: " + incorrectas);
    }
}
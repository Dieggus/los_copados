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
public class Ejercicio_7_Nico {
 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        int correcto = 0;
        int incorrecto = 0;
        do {
            System.out.println("Ingrese frase");
            frase = leer.nextLine();
            
            if (frase.length() == 5 && frase.substring(0,1).equalsIgnoreCase("X") && frase.substring(4,5).equalsIgnoreCase("O")) {
                correcto++;
            } else {
                incorrecto++;
            }
        } while (frase.equals("&&&&&") == false);
        System.out.println("Correctos: " + correcto + " \nIncorrectos: " + incorrecto);
    }
}


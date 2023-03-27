/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String frase;
        int correctas = 0, incorrectas = 0;

        do {

            System.out.println("Ingresa una frase: ");
            frase = teclado.nextLine();

            if (frase.equals("&&&&&")) {
                break;
            }

            if (frase.length() == 5 && frase.substring(0,1).equals("X") && frase.substring(4,5).equals("O")) {
                correctas++;

            } else {
                incorrectas++;

            }

        } while (true);

        System.out.println("\nInforme ");
        System.out.println("Cantidad de lecturas correctas: " + correctas);
        System.out.println("Cantidad de lecturas incorrectas: " + incorrectas);
    }
}

/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando, 
construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden
horizontal en una fila que será seleccionada de manera aleatoria. 
Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. 
Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java:
substring(), Length() y Math.random().

 */
package Ejercicios_extra_guía_5;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio_extra_6 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char[][] sopa = new char[20][20];
        String[] palabras = new String[5];
        int[] filas = new int[5];

        // Leer palabras
        for (int i = 0; i < 5; i++) {
            String palabra = "";
            while (palabra.length() < 3 || palabra.length() > 5) {
                System.out.print("Ingrese una palabra de 3 a 5 caracteres: ");
                palabra = input.nextLine().toUpperCase();
            }
            palabras[i] = palabra;
        }
        System.out.println(" ");

        // Ubicar palabras en la sopa de letras
        for (int i = 0; i < 5; i++) {
            String palabra = palabras[i];
            int fila = (int) (Math.random() * 20); // generar número aleatorio entre 0 y 19
            filas[i] = fila; // almacenar fila para luego imprimir
            int columna = (int) (Math.random() * (20 - palabra.length() + 1)); // generar columna aleatoria
            for (int j = 0; j < palabra.length(); j++) {
                sopa[fila][columna+j] = palabra.charAt(j);
            }
        }

        // Rellenar espacios vacíos con números aleatorios
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j] == 0) {
                    sopa[i][j] = (char) (Math.random() * 10 + 48);
                }
            }
        }

        // Imprimir sopa de letras
        System.out.println("Sopa de letras:");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
//        Imprimir ubicación de las palabras
//        System.out.println("Ubicación de las palabras:");
//        for (int i = 0; i < 5; i++) {
//            System.out.println(palabras[i] + " en la fila " + filas[i]);
//        }
    }
}

/*

 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

 */
package Ejercicios_Guía_5;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo: ");
        int N = input.nextInt();

        int[] array = new int[N];   //vector de dimensión N
        int[] counts = new int[5]; // contador para números de 1, 2, 3, 4 o 5 dígitos
        for (int i = 0; i < N; i++) {
            array[i] = (int) (Math.round(Math.random() * 99999 + 1));
             System.out.println("[" + array[i] + "]");
        }
     // contar los números de dígitos
for (int i = 0; i < array.length; i++) {
    int n = array[i];
    int digits = 0;

    // contar el número de dígitos en n
    while (n != 0) {
        digits++;
        n /= 10;
    }

            // actualizar el contador correspondiente
            switch (digits) {
                case 1:
                    counts[0]++;
                    break;
                case 2:
                    counts[1]++;
                    break;
                case 3:
                    counts[2]++;
                    break;
                case 4:
                    counts[3]++;
                    break;
                case 5:
                    counts[4]++;
                    break;
                default:
                    break;
            }
}

// mostrar los resultados
for (int i = 0; i < counts.length; i++) {
    System.out.printf("Números de %d dígitos: %d%n", i+1, counts[i]);
}
    }
}

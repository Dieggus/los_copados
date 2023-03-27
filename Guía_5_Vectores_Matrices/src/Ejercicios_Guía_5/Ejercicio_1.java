/*
Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente
 */
package Ejercicios_Guía_5;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio_1 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] vector = new int [100];
        
        
        int aux;
        
        for (int i = 0; i < vector.length; i++) {
            
            vector[i]= i + 1;
        }
        
        
        
        //Se utiliza un doble bucle for para comparar y ordenar los elementos del vector.   
        //En cada iteración del bucle exterior, se compara el elemento actual con los elementos restantes del vector 
        //en el bucle interior. Si se encuentra un elemento que debe estar antes que el elemento actual, se intercambian 
        //las posiciones de ambos elementos en el vector.

         int temp;
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[i] < vector[j]) {
                    // Intercambiar los elementos del vector
                    temp = vector[i];
                    vector[i] = vector[j];
                    vector[j] = temp;
                }
            }
        }
        
        for (int i = 0; i < vector.length; i++) {
            
           System.out.println("["+vector[i]+"]");
       
        }
        
    }
    
}

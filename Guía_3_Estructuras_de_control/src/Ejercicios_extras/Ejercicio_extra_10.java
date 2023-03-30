/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_extras;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio_extra_10 {
    
    public static void main(String[] args){
       
        Scanner input = new Scanner(System.in);
            int num1 = (int) (Math.random() * 11);
            int num2 = (int) (Math.random() * 11);
            int respuesta;
            
            System.out.println("Adivina la multiplicación entre " + num1 + " y " + num2 + ":");
            do {
                respuesta = input.nextInt();
                if (respuesta == num1 * num2) {
                    System.out.println("¡Respuesta correcta!");
                } else {
                    System.out.println("Respuesta incorrecta, intenta de nuevo:");
                }
            } while (respuesta != num1 * num2);
    }
}


/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números generados
aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su respuesta es o no correcta. En caso que la 
respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio 
investigue como utilizar la función Math.random() de Java.
*/
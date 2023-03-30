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
public class Ejercicio_5_ {
    
    //Bucles y sentencias de salto break y continue.
    //Escriba un programa en el cual se ingrese un valor límite positivo, y a
    //continuación solicite números al usuario hasta que la suma de los
    //números introducidos supere el límite inicial.
    
    public static void main(String[] args){
        
         Scanner input = new Scanner(System.in);
        int limite, suma = 0, num;

        System.out.print("Ingrese un límite positivo: ");
        limite = input.nextInt();

        while (true) {
            System.out.print("Ingrese un número: ");
            num = input.nextInt();

            if (num < 0) {
                System.out.println("No se permiten números negativos. Inténtelo de nuevo.");
                continue; // vuelvo a pedir un número sin sumarlo
            }

            if (suma + num > limite) {
                break; // termina el bucle si se supera el límite
            }

            suma += num;
        }

        System.out.println("La suma total es: " + suma);
    }
}

//En este ejemplo, hemos modificado el bucle para utilizar while (true) en lugar de do-while. 
//Esto nos permite tener más control sobre el flujo del programa dentro del bucle.
//Luego, hemos agregado dos condicionales if. El primer if verifica si el número ingresado es negativo. 
//Si es así, se imprime un mensaje de error y se utiliza la sentencia continue para volver al inicio del bucle y pedir 
//otro número sin sumarlo.
//El segundo if verifica si la suma de num y suma supera el límite. Si es así, se utiliza la sentencia break para salir del bucle.
//De esta manera, podemos controlar el comportamiento del programa dentro del bucle y evitar que 
//se ingresen números negativos o se sumen números que hagan que se supere el límite.
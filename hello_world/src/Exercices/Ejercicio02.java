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
public class Ejercicio02 {
    
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingresa tu nombre porfavor");
        nombre = leer.next();
        System.out.println("Tu nombre es: " + nombre);
     }
}

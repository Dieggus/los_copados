/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subprogramas.guía_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio_2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta;
        
        do {
            System.out.print("Ingrese su nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese su edad: ");
            int edad = sc.nextInt();
            sc.nextLine(); 

            imprimirDatosPersona(nombre, edad);

            System.out.print("¿Desea ingresar otra persona? (Sí/No): ");
            respuesta = sc.nextLine().toUpperCase();
        } while (!respuesta.equals("NO"));
    }

    public static void imprimirDatosPersona(String nombre, int edad) {
        String tipoEdad = (edad >= 18) ? "mayor" : "menor";
        System.out.printf("%s es %s de edad.\n", nombre, tipoEdad);
    }
}


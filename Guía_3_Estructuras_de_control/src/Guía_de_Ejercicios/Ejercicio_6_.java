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
public class Ejercicio_6_ {
    
    //Realizar un programa que pida dos números enteros positivos por
    //teclado y muestre por pantalla el siguiente menú:
    
    //Menú:
    //1. Sumar
    //2. Restar
    //3. Multiplicar
    //4. Dividir
    //5. Salir
    //Elija opción:
    
    //El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y
    //luego volver al menú. El programa deberá ejecutarse hasta que se elija la
    //opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
    //vez de salir del programa directamente, se debe mostrar el siguiente
    //mensaje de confirmación: ¿Está seguro que desea salir del programa?

    
    public class Main {
        
    }
        public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        float n1 = -1;
        float n2 = -1;
        while (n1 < 0 || n2 < 0) {
            System.out.println("Ingrese dos números positivos");
            n1 = leer.nextInt();
            n2 = leer.nextInt();
        }
        int i = 0;
        int op;
        boolean exit = false;
        
        while (exit == false) {
            System.out.println("====Menu==== \nElija la opción \n(1) Sumar \n(2) Restar \n(3) Multiplicar \n(4) Dividir \n(5) Salir");
            op = leer.nextInt();
            switch(op) {
                case 1:
                    System.out.println("La suma es: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("La resta es: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("La multiplicacion es: " + (n1 * n2));
                    break;
                case 4:
                    System.out.println("La división es: " + (n1 / n2));
                    break;
                case 5:
                    System.out.println("¿Desea salir? (S/N)");
                    String salir = leer.next();
                    if (salir.equalsIgnoreCase("s") == true) {
                        exit = true;
                    }
                    break;  
                default:
                    System.out.println("Invalido");
                    break;
            }
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercices;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Diego
 */
public class Ejercicio03 {
    //Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
    //después toda en minúsculas. 
    //Nota: investigar la función toUpperCase() y toLowerCase() en Java.

    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);//importante para ingresar por teclado
        
        System.out.println("Ingrese una frase");//solicitamos ingresar una frase
        String cadena = leer.nextLine(); //leer cadena
        
        System.out.println(toUpperCase(cadena)); //Función para poner mayúsculas
        System.out.println(toLowerCase(cadena)); //Función para poner minúsculas
        
    }
}

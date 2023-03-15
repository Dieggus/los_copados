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
public class Ejercicio_3_ {
    //Realizar un programa que permita introducir solo frases o palabras
    //de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
    //deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
    //caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
    //función Lenght() en Java.
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese una frase o palabra de ocho letras: ");
        String frase = input.nextLine();
        int size = frase.length();
        
        if (size == 8){
            
            System.out.println("CORRECTO");
            System.out.println("La palabra ingresada tiene " + size + " letras");
            
        }else{
            System.out.println("INCORRECTO");
            System.out.println("La palabra ingresada tiene " + size + " letras");
        }
    }
    
}

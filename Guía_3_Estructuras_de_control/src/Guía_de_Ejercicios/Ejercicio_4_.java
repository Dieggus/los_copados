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
public class Ejercicio_4_ {
    
//Escriba un programa que pida una frase o palabra y valide si la primera
    //letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
    //imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
    //contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
    //Substring y equals() de Java.
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra que ingrese con A: ");
        String phrase = input.nextLine();
        String chain = phrase.substring(0,1);
        
        if(chain.toLowerCase().equals("a")) {
            
            System.out.println("CORRECTO");
            
        } else {
            
            System.out.println("INCORRECTO");
        }
     
    }
    
}

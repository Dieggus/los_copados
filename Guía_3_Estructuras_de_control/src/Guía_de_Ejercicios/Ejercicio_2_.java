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
public class Ejercicio_2_ {
    
    //Crear un programa que pida una frase y si esa frase es igual a “eureka” el
    //programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
    //Incorrecto. Nota: investigar la función equals() en Java.
    
    public static void main(String[] args){
        
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese una frase por pantalla");
        String clave = input.next();
        
         if(clave.toLowerCase().equals("eureka")){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
        }
    }

    


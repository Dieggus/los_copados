/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía_tres;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Guía_3_Ejercicio_10 {
   
    //Realizar un programa que lea 4 números (comprendidos entre 1 y 20)
    //e imprima el número ingresado seguido de tantos asteriscos como indique su valor.
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int num = 1;
        
        for (int i = 0; i < 4; i++) {
            
            System.out.println("Ingrese 4 números comprendidos entre 1 y 20: ");
            num = input.nextInt();//Se ingresan por pantalla los números
            
            if (num >= 1 && num <= 20){ //Se asigna un condicional para definir el rango de los valores
               
                System.out.print("El número ingresado es " + num + " ");
                
                for (int j = 0; j < num; j++) { //bucle for para que cuente las iteraciones según el número ingresado
                    
                    System.out.print( "*" ); //Se imprime el número de estrellas por iteración.
                    
                }
                System.out.println(" ");
            } else {
                System.out.println("El número no es correcto");
                break;
            }
           
        }
         System.out.println("Gracias por usar nuestros servicios");
    }
}
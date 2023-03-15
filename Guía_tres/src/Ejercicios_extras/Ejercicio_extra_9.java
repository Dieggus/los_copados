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
public class Ejercicio_extra_9 {    
    
    public static void main(String[] args) {

  // Leer los valores del dividendo y divisor
        Scanner input = new Scanner(System.in);
            // Leer los valores del dividendo y divisor
            System.out.print("Ingrese el dividendo: ");
            int dividendo = input.nextInt();
            
            System.out.print("Ingrese el divisor: ");
            int divisor = input.nextInt();
            
            // Inicializar el contador de restas y el residuo
            int contadorRestas = 0;
            int residuo = dividendo;
            
            // Realizar la división con restas
            while (residuo >= divisor) {
                residuo -= divisor;
                contadorRestas++;
            }
            
            // Imprimir los resultados
            System.out.println("Cociente: " + contadorRestas);
            System.out.println("Residuo: " + residuo);
        }
    }  
    

      
    /*Simular la división usando solamente restas. 
    Dados dos números enteros mayores que uno, 
    realizar un algoritmo que calcule el cociente y el 
    residuo usando sólo restas. Método: Restar el dividendo 
    del divisor hasta obtener un resultado menor que el divisor,   
    este resultado es el residuo, y el número de restas realizadas 
    es el cociente.
    Por ejemplo: 50 / 13:
    50 – 13 = 37     una resta realizada
    37 – 13 = 24     dos restas realizadas
    24 – 13 = 11     tres restas realizadas
    dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3
*/



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
public class Ejercicio05 {
    
    //Escribir un programa que lea un número entero por teclado y muestre por 
    //pantalla el doble, el triple y la raíz cuadrada de ese número. 
    //Nota: investigar la función Math.sqrt().

    
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero: ");
        int num = leer.nextInt();
        
        
        
        int doble = num * 2;
        int triple = num * 3;
        double raiz = num;
       
        System.out.println("El doble del número es:" +doble);
        System.out.println("El triple del número es:" +triple);
        System.out.println("La raíz cuadrada del número es:" +Math.sqrt(raiz));
    }
    
}

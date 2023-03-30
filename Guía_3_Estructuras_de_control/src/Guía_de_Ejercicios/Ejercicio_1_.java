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
public class Ejercicio_1_ {
    //Crear un programa que dado un número determine si es par o impar.
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int num;
        int cont;
        
        System.out.println("Ingrese cuantos números controlara");
        cont = input.nextInt();
        
        for (int i = 0; i < cont; i++) {
             System.out.println("Ingrese un número para saber si es par o impar:");
        num = input.nextInt();
        
        if (num % 2 == 0){
            
            System.out.println("El número " + num + " es par");
        }else{
            System.out.println("El número " + num + " es impar");
        } 
        }
       
    }
    
}

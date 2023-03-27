/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Guía_5;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio_2 {
    
      public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
    
          System.out.println("Ingrese el tamaño de la matriz");
          int N = input.nextInt();
          
        int vector[] = new int[N];
        
        for (int i = 0; i < N; i++) {
            
           vector[i] = (int) (Math.random()*20+1);
            
        }
        
        for (int i = 0; i < N; i++) {
            
            System.out.println("[" + vector[i] + "]");
        }
        
        System.out.println("Ingrese el valor a buscar en el arreglo: ");
        int num = input.nextInt();
        int cont = 0;
          for (int i = 0; i < N; i++) {
              if (vector[i] == num) {
              cont++;
              }
          }
   
         System.out.println("El número " + num +" se encuentra "+cont+" veces");
    }
    
}

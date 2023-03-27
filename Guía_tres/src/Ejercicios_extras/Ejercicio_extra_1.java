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
public class Ejercicio_extra_1 {
    
// Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
//ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
//equivalente: 1 día, 2 horas.
    
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el tiempo en minutos para saber su equivalente en días y horas");
        int minutos = input.nextInt();
      
        int horas = minutos / 60;
        int dias = horas / 24;
        
        horas = horas % 24;
        
        
        System.out.println("Los " +minutos+ " minutos equivalen a " +dias+ " días y " +horas+ " horas");
        
    }    
}

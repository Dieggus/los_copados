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
public class Ejercicio04 {
    //Dada una cantidad de grados centígrados se debe mostrar su equivalente 
    //en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
    
    //El usuario debe ingresar los grados centigrados 
    
    public static void main(String[] args){
    
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese los grados Celsius a convertir");
        System.out.println(" a Fahrenheit:");
        double C = leer.nextDouble();
        
        System.out.print("Los grados ingresados son " +C);  
        System.out.println("° celsius");
        
        double F = 32 + (9 * C / 5);
        
        System.out.print("Que convertidos son " +F);
        System.out.println("° Fahrenheit");
    }
    
}
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
public class Guía_3_Ejercicio_8 {
    //Escriba un programa que valide si una nota está entre 0 y 10, sino está 
    //entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        int nota;
        
        System.out.println("Ingrese una nota que se encuentre el 0 y el 10");
        nota = leer.nextInt();
        
        while (nota < 0 || nota > 10){
            
            System.out.println("La nota ingresada es incorrecta. Intente nuevamente");
            nota = leer.nextInt();
        }
        
        System.out.println("Nota correcta");
    }
}

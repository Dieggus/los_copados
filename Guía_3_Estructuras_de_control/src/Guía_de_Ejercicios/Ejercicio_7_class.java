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
public class Ejercicio_7_class {
    
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int correcto = 0;
        int incorrecto = 0;
        String code;
        do{
            System.out.println("Introduzca un codigo"); 
            code = leer.next();
            if (code.length() == 5 && code.substring(0,1).equals("x") && code.substring(4,5).equals("o")){
           correcto++;
            }else{
            incorrecto++;
            }               
        } while  (code.equals("&&&&&") == false);
        System.out.println("La cantidad de codigos correctos son: " + correcto);
        System.out.println("La cantidad de codigos incorrectos son: " + (incorrecto-1));
    } 
}

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
public class Guía_3_Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    //Implementar un programa que le pida dos números enteros al usuario y 
    //determine si ambos o alguno de ellos es mayor a 25.
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
     
        System.out.println("Ingrese dos números enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        if ( num1 > 25 && num2 > 25)
        {
         
            System.out.println("Los dos números son mayores que 25");
        
        }else if (num1 > 25 || num2 > 25){
              System.out.println("Uno de los dos números es mayor que 25");
        }
        else
        {
        
             System.out.println("Ninguno de los números es mayor a 25");
        }
    
        }
    }



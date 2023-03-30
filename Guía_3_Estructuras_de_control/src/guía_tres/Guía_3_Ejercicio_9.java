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
public class Guía_3_Ejercicio_9 {
    //Escriba un programa que lea 20 números. Si el número leído es igual a cero 
    //se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
    //El programa deberá calcular y mostrar el resultado de la suma de los números 
    //leídos, pero si el número es negativo no debe sumarse. 
    //Nota: recordar el uso de la sentencia break.
    

    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        
        int nro = 1, suma = 0;
        int[] numeros = new int[20];
        
         for (int i= 0; i< 20; i++){
            System.out.print("Ingrese un valor: ");
            nro = leer.nextInt();
            numeros[i]=nro;
           if (nro == 0) {
                System.out.println("Se capturó el número cero.");
                break;
            } else if (nro > 0) {
                suma += nro;
            } else {
                System.out.println("El número ingresado es negativo. No se sumará.");
            }
        }
        
        System.out.println("La suma de los números positivos ingresados es: " + suma);
    }
}

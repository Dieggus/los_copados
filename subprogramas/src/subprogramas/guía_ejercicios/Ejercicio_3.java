/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subprogramas.guía_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio_3 {
//Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado 
//a otra moneda, estas pueden ser a dólares, yenes o libras. 
//La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena, este no 
//devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
//El cambio de divisas es:
//* 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\nIngrese la cantidad de euros a convertir");
        double cantidadEuros = input.nextInt();
        
        System.out.println("\nIngrese el tipo de cambio: Dolar, Yen o Libra esterlina:");
        String cambio = input.next();
        
        tipoCambioMoneda(cantidadEuros,cambio);
    }
    
    public static void tipoCambioMoneda(double cantidadEuros, String cambio) {
        double cambioDivisa = 0;
        String TipoCambio;
        
        switch(cambio.toLowerCase()) {
            case "libras" :
                cambioDivisa = 0.86;
                TipoCambio = "Libras";
                break;
            case "yen" :
                cambioDivisa = 1.28611;
                TipoCambio = "Yenes";
                break;
            case "dolar" :
                cambioDivisa = 129.852;
                TipoCambio = "Dolares";
                break;
            default:
                System.out.println("El tipo de moneda es inválida ");
                return;
        }
        
        double conversion = cantidadEuros * cambioDivisa;
        System.out.println(cantidadEuros + " euros equivalen a  " + conversion + " " + TipoCambio + ".");
    }
}

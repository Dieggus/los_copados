/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author Usr
 */
public class ejercicioUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        System.out.println("la suma de los numeros es: " + sumar(num1,num2));
        System.out.println("la resta de los numeros es: " + restar(num1,num2));
        System.out.println("la division de los numeros es: " + dividir(num1,num2));
        System.out.println("la multiplicacion de los numeros es: " + multiplicar(num1,num2));
            
    }
    
    public static int sumar(int num1, int num2) {
    	int suma;
    	suma = num1 + num2;
    	return suma;
    }
    
    public static int restar(int num1, int num2){
       int resta;
       resta=num1-num2;
       return Math.abs(resta);
       
    }
    
    public static double dividir(double num1, double num2){
        double division;
        division=num1/num2;
        return division;
    }
    
    public static double multiplicar(int num1, int num2){
        int multi;
        multi= num1*num2;
        return multi;
    }
}

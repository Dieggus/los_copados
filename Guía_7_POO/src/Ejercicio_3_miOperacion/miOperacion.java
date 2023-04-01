/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_3_miOperacion;

import Ejercicio_3_Operacion.Operacion;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class miOperacion {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        Operacion miOperacion = new Operacion();
        
        miOperacion.crearOperacion();
        
        double result=miOperacion.sumar();
        System.out.println("El resultado de la suma es " + result);
        
        double rest=miOperacion.restar();
        System.out.println("El resultado de la resta es " + rest);
        
        double multiplicar = miOperacion.multiplicar();
        System.out.println("\nEl resultado de la multiplicación es " + multiplicar);
        
        double Dividir = miOperacion.Dividir();
        System.out.println("\nEl resultado de la división es " + Dividir);
    }
}

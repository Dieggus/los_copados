/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2_Circulo;

import Ejercicio_2_Circunferencia.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio_2_Circulo {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        Circunferencia c1 = new Circunferencia(3.0);
        System.out.println("El radio de c1 es "+ c1.getRadio());
        
        Circunferencia c2 = Circunferencia.crearCircunferencia();
        System.out.println("El radio de c2 es " + c2.getRadio());
        
        double area = c1.area();
        System.out.println("El area de c1 es " + area);
        
        double perimetro = c2.perimetro();
        System.out.println("El perímetro de c2 es  " + perimetro);
        
    }
    
}

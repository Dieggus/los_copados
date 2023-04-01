/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4_Dibujar_rectángulo;

import Ejercicio_4_Rectangulo.Rectángulo;

/**
 *
 * @author Diego
 */
public class Dibujar_Rectángulos {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args){
        
        Rectángulo Rec1 = new Rectángulo();
        
        
        Rec1.crearRectangulo();
        
        int superficie=Rec1.superficie();
        System.out.println("La superficie del rectángulo es " + superficie);
        
        int perimetro=Rec1.perimetro();
        System.out.println("El perímetro del rectángulo es " + perimetro);
        
        Rec1.crearRectanguloAsteriscos();
    }
    
}

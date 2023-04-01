/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package Ejercicio_2_Circunferencia;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Circunferencia {

     private double radio;
    
    // Constructor que inicializa el radio pasado como parámetro
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    // Métodos get y set para el atributo radio de la clase Circunferencia
    public double getRadio() {
        return radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    // Método para crear una Circunferencia
    public static Circunferencia crearCircunferencia() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el radio de la circunferencia: ");
        double radio = scanner.nextDouble();
        return new Circunferencia(radio);
    }
    
    // Método para calcular el área de la circunferencia
    public double area() {
        return Math.PI * radio * radio;
    }
    
    // Método para calcular el perímetro de la circunferencia
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
}
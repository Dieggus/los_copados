/*
 Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2
 */
package Ejercicio_3_Operacion;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Operacion {
    

    //Atributos 
    
    private double numero1;
    private double numero2;
    
    
   //Constructores

    
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }
    
    //Métodos propios

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número ");
        double a=input.nextInt();
        System.out.println("Ingrese el segundo número ");
        double b = input.nextInt();
        this.setNumero1(a);
        this.setNumero2(b);
    }
    
    public double sumar (){
        double result = this.numero1+this.numero2;
        return result;
    }
    
    public double restar(){
        double rest = this.numero1 - this.numero2;
        return rest;
    }
    
    public double multiplicar() {
        if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.print("\nEl resultado da ERROR");
            return 0;
        } else {

            double multiplo = this.numero1 * this.numero2;
            return multiplo;
            
        }   
    }
    
     public double Dividir() {
        if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.print("\nEl resultado da ERROR");
            return 0;
        } else {

            double dividendo = this.numero1 / this.numero2;
            return dividendo;
        }   
    }
}

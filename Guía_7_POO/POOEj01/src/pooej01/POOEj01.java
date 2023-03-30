/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Persona;
<<<<<<< HEAD
import java.util.Scanner;
=======

>>>>>>> cb39bf6d3dacf09f6aa4b07bc2e68816ff5d1828
/**
 *
 * @author Diego
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
<<<<<<< HEAD
        //Instanciación (creación) utilizando el constructor vacío
        Persona primeraPersona = new Persona();
        //Instanciación usando el constructor por parámetro
        Persona segundaPersona = new Persona("Mariano");
        
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el nombre de la persona: ");
        String nombre=input.next();
        System.out.println("Ingrese la edad: ");
        int edad=input.nextInt();
        System.out.println("Ingrese el sexo: ");
        String sexo=input.next();
        
        //invocamos desde la main los métodos de la clase.
        primeraPersona.llenarPersona(nombre, edad, sexo);
        primeraPersona.mostrarPersona();
        
        System.out.println("");
        
        System.out.println("Ingrese el nombre de la persona: ");
        String nombre2=input.next();
        System.out.println("Ingrese la edad: ");
        int edad2=input.nextInt();
        System.out.println("Ingrese el sexo: ");
        String sexo2=input.next();
        
        
        segundaPersona.llenarPersona(nombre2, edad2, sexo2);
        segundaPersona.mostrarPersona();
=======
        //Instanciación (creación) utilizando el constructor por defecto.
        Persona primeraPersona = new Persona();
        //Instanciación utilizando el constructor por parámetros.
        Persona segundaPersona = new Persona("Mariano");
     
>>>>>>> cb39bf6d3dacf09f6aa4b07bc2e68816ff5d1828
    }
    
}

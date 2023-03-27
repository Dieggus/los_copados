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
public class ejercicioDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int respuesta;
        
        do{
            System.out.println("ingrese la edad y el nombre");
            int edad=leer.nextInt();
            String nombre=leer.nextLine();
            respuesta=respuesta(edad,nombre);
        }while(respuesta==1);
    }
       
    
    
    public static int respuesta(int edad, String nombre){
        Scanner leer=new Scanner(System.in);
        int devolucion=0;
        
        System.out.println(nombre + " tiene " + edad+ " años");
        if (edad<18){
            System.out.println(nombre + " es menor de edad");
        }else{
            System.out.println(nombre+ " es mayor de edad");
        }
        System.out.println("desea seguir ingresando personas? 1.SI 2.NO");
        devolucion=leer.nextInt();
        return devolucion;
         
        
    }
}

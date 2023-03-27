/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía_5_vectoresmatrices;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio_13_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo
        //y define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
        Scanner input = new Scanner(System.in);
        
        String[ ] Equipo = new String[9]; //creamos el vector para el tipo String en este caso
        
        for (int i = 0; i < 9; i++) { //bucle for para almacenar los nombres
            
            System.out.println("\nIngrese el nombre de sus compañeros");
            Equipo[i] = input.nextLine();
          
        }
        for (int i = 0; i < 9; i++) {
                 System.out.println("[" + Equipo[i] + "]");
        }
   
    }
    
}

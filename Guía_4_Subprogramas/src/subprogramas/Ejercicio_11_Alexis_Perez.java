/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subprogramas;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio_11_Alexis_Perez {
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = scanner.nextLine();
        codigo(frase);
    }
    
    public static void codigo(String frase){
        String frase2 = "";
        for(int i = 0; i <= frase.length()-1; i++){
        int j = i + 1;
            
            switch(frase.substring(i,j)){
                case "a": frase2 = frase2.concat("@");
                break;
                case "e": frase2 = frase2.concat("#");
                break;
                case "i": frase2 = frase2.concat("$");
                break;
                case "o": frase2 = frase2.concat("%");
                break;
                case "u": frase2 = frase2.concat("*");
                break;
                default: frase2 = frase2.concat(frase.substring(i,j));
            }
        
    }
        System.out.println(frase);
        System.out.println(frase2);
    }
}
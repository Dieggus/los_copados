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
public class Ejercicio_11_Subprogramas {
    //Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, y 
    //luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el carácter 
    //que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
    
    // a = @ ; e = # ; i = $ ; o = % ; u = *
    
    //Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. 
    //Utilice la estructura “según” para la transformación. 
    //Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
    //La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        String phrase = input.nextLine();
        
        String exit = NewPhrase(phrase);
        
        System.out.println("Texto códificado: " + exit);
        
    }
    
    public static String NewPhrase(String phrase) {
       String result = "";
        
       for (char c : phrase.toCharArray()) {
           switch (c){
                 case 'a':
                case 'A':
                    result = result.concat("@");
                    break;
                case 'e':
                case 'E':
                    result = result.concat("#");
                    break;
                case 'i':
                case 'I':
                    result = result.concat("$");
                    break;
                case 'o':
                case 'O':
                    result = result.concat("%");
                    break;
                case 'u':
                case 'U':
                    result = result.concat("*");
                    break;
                default:
                    result = result.concat(Character.toString(c));
                    break;
           }
       } 
       
        
        return result;
                
    }
}

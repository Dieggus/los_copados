/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1_Biblioteca;

import Ejercicio_1_Libros.Libro;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Catalogo_libros {
    public static void main(String[] args){
        
        Libro L1 = new Libro();

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el ISBN: ");
        String ISBN = input.next();
        System.out.println("Ingrese el título del libro: ");
        String Titulo = input.next();
        System.out.println("Ingrese el nombre del autor: ");
        String Autor = input.next();
        System.out.println("ingrese el número de paginas: ");
        int pageNum = input.nextInt();
        
        L1.llenarLibros(ISBN, Titulo, Autor, pageNum);
        L1.mostrarLibros();
    }
}

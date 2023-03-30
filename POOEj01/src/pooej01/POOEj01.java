/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Persona;

/**
 *
 * @author Diego
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instanciación (creación) utilizando el constructor por defecto.
        Persona primeraPersona = new Persona();
        //Instanciación utilizando el constructor por parámetros.
        Persona segundaPersona = new Persona("Mariano");
     
    }
    
}

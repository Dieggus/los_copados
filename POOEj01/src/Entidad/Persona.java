/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Diego
 */
public class Persona {
    
         
// atributos
//<modificador>* <tipo> <nombre>
    public int Edad;
    public String Nombre;
    public int Altura;
    public String Documento;

    
// constructores
    //[<modificador>] <nombre de clase> ( <argumento>* ) {
    //   <sentencia>*
    //}

    public Persona() {
    }
    
    public Persona(String Nombre){
        this.Nombre = Nombre;
    }

    public Persona(int Edad, String Nombre, int Altura, String Documento) {
        this.Edad = Edad;
        this.Nombre = Nombre;
        this.Altura = Altura;
        this.Documento = Documento;
        
    }

    
    //Métodos propios
    /*<modificador>* <tipo de retorno> <nombre> ( <argumento>>* ) {
	<sentencias>*
    return valorRetorno;       	
    }
    */
    
    //Método get: Se utilizan para consultar el estado de un objeto
    public int getEdad() {
        return Edad;
    }
    //Método set: Se utilizan para modificar las caracteristicas de un objeto
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int Altura) {
        this.Altura = Altura;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    
}

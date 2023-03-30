/*
        Todos los objetos poseen dos caracteristicas: estado y comportamiento.
       *Estado: informa sobre las caracteristicas que posee el objeto (Ej.: color, estatura, edad, etc). El estado de un objeto 
        es una lista de variables conocidas como sus atributos.
       *Comportamiento: Informa sobre  las acciones que puede realizar el objeto (Ej.: correr, tomar otro objeto, reír, etc)
        El comportamiento es una lista de métodos, procedimientos, funciones u operaciones que un objeto puede 
        ejecutar a solicitud de otros objetos.  
 */
package Entidad;

/**
 *
 * @author Diego
 */
public class Persona { //los nombres de las clases siempre comienzan con mayúscula; si son compuestos cada palabra debe comenzar igual
    
// atributos
    //<modificador>* <tipo> <nombre> // * por ahora solo modificadores de visibilidad: public, protected, private.
    public String nombre;
    public int edad;
    public String sexo;
    


// constructores
    /*[<modificador>] <nombre de clase> ( <argumento>* ) {
    <sentencia>*
    }
     */
    public Persona(int edad, String sexo) {
        this.edad = edad;
        this.sexo = sexo;
    }

   
    //constructor por defecto
    public Persona() {
    }
    
    //constructor por parámetros
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
// métodos propios
    /*<modificador>* <tipo de retorno> <nombre> ( <argumento>>* ) {
	<sentencias>*
    return valorRetorno;       	
}*/
    public String getNombre() {
        return nombre;
        
    }

    public void setNombre(String nombre) { //método set: modifica su estado. Es un método modificador.
        this.nombre = nombre;
    }

    public int getEdad() { //metodo get: consulta el estado de un objeto. Es un método de consulta.
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }
    
   public void setSexo(String sexo) {
        this.sexo = sexo;
   }
   //super setter o Método llenar
   public void llenarPersona(String nombre, int edad, String sexo) {
       this.nombre=nombre;
       this.edad=edad;
       this.sexo=sexo;
   }
   
   //Método mostrar
   public void mostrarPersona() {
       System.out.println("El nombre de la persona es: "+nombre);
       System.out.println("La edad de la persona es: "+edad+" años");
       System.out.println("El sexo de la persona es: "+sexo);
   }
}

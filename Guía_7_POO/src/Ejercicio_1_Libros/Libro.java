/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, 
y un constructor con todos los atributos pasados por parámetro y un constructor vacío. 
Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas.

 */
package Ejercicio_1_Libros;

/**
 *
 * @author Diego
 */
public class Libro {
    
    //atributos
    
   public String ISBN;
   public String Titulo;
   public String Autor;
   public int pageNum;

    public Libro(String ISBN, String Titulo, String Autor, int pageNum) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.pageNum = pageNum;
    }

    public Libro() {
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
   
   
   public void llenarLibros(String ISBN, String Titulo, String Autor, int pageNum) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.pageNum = pageNum;
    }
   
   public void mostrarLibros() {
       System.out.println("El ISBN es: "+ISBN);
       System.out.println("El título del libro es: "+Titulo);
       System.out.println("El autor del libro es: "+Autor);
       System.out.println("El número de paginas es de: "+pageNum+" páginas.");
   }
    
}

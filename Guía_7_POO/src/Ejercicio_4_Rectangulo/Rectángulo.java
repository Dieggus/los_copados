/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado 
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo 
con los datos del Rectángulo dados por el usuario. 
También incluirá un método para calcular la superficie del rectángulo y un método 
para calcular el perímetro del rectángulo. 
Por último, tendremos un método que dibujará el rectángulo mediante asteriscos 
usando la base y la altura. Se deberán además definir los métodos 
getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.

 */
package Ejercicio_4_Rectangulo;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Rectángulo {
    
    private int base;
    private int high;

    public Rectángulo() {
    }

    public Rectángulo(int base, int high) {
        this.base = base;
        this.high = high;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public void crearRectangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la base del rectángulo: ");
        int B = scanner.nextInt();
        System.out.println("Ingrese la altura del rectángulo: ");
        int H = scanner.nextInt();
        this.setBase(B);
        this.setHigh(H);
    }

    public int superficie() {
        return base * high;
    }

    public int perimetro() {
        return (2*base)+(2*high);
    }
    
    
    public void crearRectanguloAsteriscos(){
        
         for (int i = 1; i <= this.high; i++) {
            for (int j = 1; j <= this.base; j++) {
                if (i == 1 || i == this.high) {
                    System.out.print("* ");
                } else if (j == 1 || j == this.base){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    @Override
    public String toString() {
        return "Rect\u00e1ngulo{" + "base=" + base + ", high=" + high + '}';
    }
    
}

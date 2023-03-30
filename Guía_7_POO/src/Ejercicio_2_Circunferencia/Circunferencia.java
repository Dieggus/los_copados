/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package Ejercicio_2_Circunferencia;

/**
 *
 * @author Diego
 */
public class Circunferencia {

    private float Radio;

    public float getRadio() {
        return Radio;
    }

    public void setRadio(float Radio) {
        this.Radio = Radio;
    }

    public Circunferencia(float Radio) {
        this.Radio = Radio;
    }
    
    public void crearCircunferencia(float Radio) {
         this.Radio = Radio;
    }
    

}

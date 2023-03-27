/*
 Realizar la multiplicación de un vector por una matriz.

Dado un vector de 1xN y una matriz de NxM, el resultado del producto es 1xM

Ej.: vector 1*2 * matriz 2*3 = producto de 1*3

v= [3,5] * m= [4,8,6] = [3*4+5*2,3*8+5*1,3*6+5*7] = [22, 29, 53 ]
                     [2,1,7]
 */
package guía_5_vectoresmatrices;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejemplo_VectorxMatriz {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //Declaración y creación de un vector
        //tipo[] nombreVector = new tipo[Tamaño]
        
        //declarar un arreglo de una dimensión
        int[] vector;
        //crear en memoria (construir/dimensionar) con el valor por defecto (cero para los entero)
        vector = new int[2];
        //los dos pasos en una linea
        int[] producto = new int[3];
        
        //Declaración y creación de una matriz
        //tipo [ ] [ ] nombreMatriz = new tipo [Filas] [Columnas]
        
        //declaración e inicialización con valores predeterminados
        int [] [] matriz = {{4, 8, 6}, {2, 1, 7}};
        
        //declaración y creación de arreglos genéricos
        //tipo [ ] [ ] nombreArreglo = new tipo [Cardinalidad 1] [Cardinalidad 2]...[Cardinalidad N]

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese los valores del vector de tamaño "+vector.length+":");
        //int = 0 por que los subíndices de los arreglos en Java inician en 0
        for (int i = 0; i < vector.length; i++) {
            System.out.println("v["+i+"]=");
            //acceder al valor de i
            vector[i] = input.nextInt();
        }
        //multiplica Vector*Matriz
        int sum;
        //para columna de la matriz
        for (int j = 0; j < matriz[0].length; j++) {
            sum=0;
            //recorro el vector y multiplico
            for (int i = 0; i < vector.length; i++) {
                sum += vector[i]*matriz[i][j];
            }
            producto[j]=sum;
        }
        String aux = " ";
        
        //Mostrar vector
        System.out.println("* Vector: ");
        //bucle for "mejorado" (enhanced)
        //for (tipo elemento : arreglo
        for (int elemento : vector) {
            aux += " " + elemento;
            
        }
        System.out.println(aux);
        
        //Mostrar Matriz
        System.out.println("'\n* Matriz:");
        //Para cada fila de la matriz
        for (int [] fila : matriz) {
            aux = " ";
            //Para cada columna de la Matriz
            for (int elemento : fila) {
                aux += " " + elemento;
            }
            System.out.println(aux);
        }
        //Mostrar el resultado
        aux = " ";
        System.out.println("\n* Vector x Matriz:");
        for (int elemento : producto) {
            aux += " " + elemento;
        }
        System.out.println(aux);
    }
}

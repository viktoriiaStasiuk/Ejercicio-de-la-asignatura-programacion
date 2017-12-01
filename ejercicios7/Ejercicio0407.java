/**
 * Define tres arrays de 20 números enteros cada una, con nombres numero ,
 *cuadrado y cubo . Carga el array numero con valores aleatorios entre 0 y 100. En el
 *array cuadrado se deben almacenar los cuadrados de los valores que hay en el
 *array numero . En el array cubo se deben almacenar los cubos de los valores que
 *hay en numero . A continuación, muestra el contenido de los tres arrays dispuesto
 *en tres columnas.
 * 
 */

public class Ejercicio0407 {

  public static void main(String[] args) {
    
    int[] numero;
    numero = new int [20];
    
    int[] cuadrado;
    cuadrado = new int [20];
    
    int[] cubo;
    cubo = new int [20];
    
    int i;

    System.out.println("El contenido de los tres arrayas: "); 
    
      for (i = 0; i < 20; i++) {
         numero[i] = (int)(Math.random()*100);
         cuadrado[i] = numero[i] * numero[i];
         cubo[i] = numero[i] * numero [i] * numero[i];
         
      System.out.printf( "%2d │ %4d │%6d\n",numero [i], cuadrado [i], cubo [i]);
      
      }
    }
  }
      
    
    
     

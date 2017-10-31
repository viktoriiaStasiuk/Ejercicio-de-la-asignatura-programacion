/**
 *10.Escribe un programa que calcule la media de un conjunto de números
 *positivos introducidos por teclado. A priori, el programa no sabe
 *cuántos números se introducirán. El usuario indicará que ha terminado
 *de introducir los datos cuando meta un número negativo.
 * 
 * @author Luis José Sánchez
 */

public class Ejercicio0510 {

  public static void main(String[] args) {
    
    double numeros = 0;
    double numeroInt = 0;
    double suma = 0;

    System.out.println("Calculadora de media de un conjunto de números positivos introducidos por teclado");
    System.out.println("Introduzca numeros enteros (introduzca un número negativo para salir):");

    while (numeroInt >= 0) {
      numeroInt = Integer.parseInt(System.console().readLine());
      numeros++;
      suma += numeroInt;
    }
      System.out.println("La media es " + (suma - numeroInt)/ (numeros - 1));

  }
}

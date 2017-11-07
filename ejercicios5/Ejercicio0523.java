/**
 *23.Escribe un programa que permita ir introduciendo una serie indeterminada
 *de números mientras su suma no supere  el valor 10000. Cuando esto último
 *ocurra, se debe mostrar el total acumulado, el contador de los números
 *introducidos y la media.
 * 
 * @author Luis José Sánchez
 */
public class Ejercicio0523 {

  public static void main(String[] args) {

    System.out.println("Por favor, introduzca una serie indeterminada de números");
    System.out.println("El programa termina cuando la suma de los números supere el valor 10000.");
    
    int numeroIntr;
    int suma = 0;
    int numeros = 0;
    
    do {
      numeroIntr = Integer.parseInt(System.console().readLine());
      suma += numeroIntr;
      numeros++;
    } while (suma <= 10000);
    
    System.out.println("En total hay " + numeros + " números introducidos");
    System.out.println("La suma es " + suma + ".");
    System.out.println("La media es " + suma / numeros + ".");
  }
}

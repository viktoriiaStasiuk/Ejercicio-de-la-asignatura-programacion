/**
 * 16.Escribe un programa que diga si un número introducido por teclado
 * es o no primo. Un número primo es aquel que sólo es divisible entre
 * él mismo y la unidad.
 * 
 * @author Luis José Sánchez
 */

public class Ejercicio0516 {

  public static void main(String[] args) {
            
    System.out.print("Introduzca el número: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    boolean numPrimo = true;
    
    for (int i = 2; i < numeroIntroducido; i++) {
      if (numeroIntroducido % i == 0) {
        numPrimo = false;
      }
    }
        
    if (numPrimo) {
      System.out.println("Este número es primo.");
    } else {
      System.out.println("Este número no es primo.");
    }

  }
}

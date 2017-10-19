/**
 * 3. Lectura de datos desde teclado
 *
 * 1. Realiza un programa que pida dos números y que luego muestre el
 *    resultado de su multiplicación.
 *
 * @author Luis José Sánchez
 */

public class Ejercicio0301 {
  public static void main(String[] args) {
    
    String linea;

    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    int x;
    x = Integer.parseInt( linea );

    System.out.print("introduce otro, por favor: ");
    linea = System.console().readLine();
    int y;
    y = Integer.parseInt( linea );

    System.out.print("El primer número introducido es " + x);
    System.out.println(" y el segundo es " + y);
    System.out.print("El resultado de su multiplicación es ");
    System.out.println(x + "*" + y + "=" + (x * y));
  }
}

/**
 * 3. Lectura de datos desde teclado
 *
 * 4. Escribe un programa que sume, reste, multiplique y divida dos
 *    números introducidos por teclado.
 *
 * @author Luis José Sánchez
 */

public class Ejercicio0304 {
  public static void main(String[] args) {

        String linea;

    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    double x;
    x = Double.parseDouble( linea );

    System.out.print("introduce otro, por favor: ");
    linea = System.console().readLine();
    double y;
    y = Double.parseDouble( linea );

    System.out.print("El primer número introducido es " + x);
    System.out.println(" y el segundo es " + y);
    System.out.print("El resultado de su suma es ");
    System.out.println(x + "*" + y + "=" + (x + y));
    System.out.print("El resultado de su resta es ");
    System.out.println(x + "*" + y + "=" + (x - y));
    System.out.print("El resultado de su multiplicación es ");
    System.out.println(x + "*" + y + "=" + (x * y));
    System.out.print("El resultado de su divición es ");
    System.out.println(x + "*" + y + "=" + (x / y));
  }
}

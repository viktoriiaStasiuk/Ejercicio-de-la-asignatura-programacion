/**
 * 3. Lectura de datos desde teclado
 *
 * 5. Escribe un programa que calcule el área de un rectángulo.
 *
 * @author Luis José Sánchez
 */

public class Ejercicio0305 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce un número de longitud del rectángulo: ");
    linea = System.console().readLine();
    double x;
    x = Double.parseDouble( linea );

    System.out.print("introduce otro número, por favor, que es la anchura del rectángulo: ");
    linea = System.console().readLine();
    double y;
    y = Double.parseDouble( linea );
  
    System.out.print("El área de un rectángulo es ");
    System.out.println(x + "*" + y + "=" + (x * y));
  }
}

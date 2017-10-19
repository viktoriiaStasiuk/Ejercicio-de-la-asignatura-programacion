/**
 * 3. Lectura de datos desde teclado
 *
 * 3. Realiza un conversor de pesetas a euros. La cantidad de pesetas
 *    que se quiere convertir debe ser introducida por teclado.
 *
 * @author Luis José Sánchez
 */

public class Ejercicio0303 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca la cantidad de pesetas: ");
    double pesetas = Integer.parseInt(System.console().readLine());

    double euros = pesetas * 000.6;

    System.out.printf(pesetas + " pesetas son " + euros + " euros ");
  }
}

/**
 * 11. Realiza un conversor de Kb a Mb.
 *
 * @author Luis José Sánchez
 */

public class Ejercicio0311 {
  public static void main(String[] args) {

    System.out.print("Introduzca el número de Kb para conversarlo en Mb: ");
    double kb = Double.parseDouble(System.console().readLine());
    System.out.println(kb + "Kb es" +  (kb / 1024) + "Mb");
  }
}

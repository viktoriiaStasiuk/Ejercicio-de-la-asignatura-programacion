/**
 * 10. Realiza un conversor de Mb a Kb.
 *
 * @author Luis José Sánchez
 */

public class Ejercicio0310 {
  public static void main(String[] args) {

    System.out.print("Introduzca el número de Mb para conversarlo en Kb: ");
    double mb = Double.parseDouble(System.console().readLine());
    System.out.println(mb + "Mb es " +  (mb * 1024) + "Kb");
  }
}

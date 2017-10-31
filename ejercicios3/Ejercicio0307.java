/**
 * 7. Escribe un programa que calcule el total de una factura a partir
 *    de la base imponible.
 *
 * @author Luis José Sánchez
 */

public class Ejercicio0307 {
  public static void main(String[] args) {

    System.out.print("Introduzca la base imponible: ");
    double baseImponible = Double.parseDouble(System.console().readLine());

    System.out.printf("Base imponible %8.2f\n", baseImponible);
    System.out.printf("IVA %8.2f\n", (baseImponible * 0.21));
    System.out.printf("Total %8.2f\n", (baseImponible * 1.21));
  }
}

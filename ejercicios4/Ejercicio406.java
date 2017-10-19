/**
 * 6. Realiza un programa que calcule el tiempo que tardará en caer un
 *    objeto desde una altura h.
 *    t = raiz(2h/g) siendo g = 9.81 m/s2
 *
 * @author Luis José Sánchez
 */
public class Ejercicio406 {

  public static void main(String[] args) {

    System.out.println("Cálculo el tiempo que tardará en caer un objeto desde una altura h.");
    System.out.print("Por favor, introduzca la altura en metros: ");
    double h = Double.parseDouble(System.console().readLine());
   
    final double g = 9.81;
    double s = Math.sqrt(2*h/g);

    System.out.printf("El objeto tardará" + s + "segundos");
  }
}

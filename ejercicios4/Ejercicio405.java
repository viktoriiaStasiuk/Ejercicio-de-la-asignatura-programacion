/**
 * 5. Realiza un programa que resuelva una ecuación de primer grado
 *(del tipo ax + b = 0).
 *
 * @author Luis José Sánchez
 */

public class Ejercicio405 {
  public static void main(String[] args) {

    
    System.out.print("Por favor, introduzca a para resolver ax+b+c: ");
    Double a = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca b para resolver ax+b+c: ");
    Double b = Double.parseDouble(System.console().readLine());

    if (a == 0) {
      System.out.println("No existe solucion");
    } else {
      System.out.println("x = " + (-b/a));
    }
  }
}

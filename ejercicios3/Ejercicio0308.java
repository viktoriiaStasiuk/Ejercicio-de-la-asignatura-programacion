/**
 * 8. Escribe un programa que calcule el salario semanal de un empleado
 *    en base a las horas trabajadas, a razón de 12 euros la hora.
 *
 * @author Luis José Sánchez
 */

public class Ejercicio0308 {
  public static void main(String[] args) {

    System.out.print("Introduzca el número de horas trabajadas: ");
    int horas = Integer.parseInt(System.console().readLine());
    System.out.println("El salario semanal es" + (horas * 12) + " euros");
  }
}

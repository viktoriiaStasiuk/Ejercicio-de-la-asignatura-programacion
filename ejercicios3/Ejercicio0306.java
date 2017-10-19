/**
 * 
 * 6. Escribe un programa que calcule el área de un triángulo.
 *
 * @author Luis José Sánchez
 */

public class Ejercicio0306 {
  public static void main(String[] args) {

    System.out.println("Área de un triángulo");
    System.out.print("Por favor, introduzca la longitud: ");
    double base = Double.parseDouble(System.console().readLine());
    System.out.print("Inroduzca la altura: ");
    double altura = Double.parseDouble(System.console().readLine());
    System.out.println("El área del triángulo es " + (base * altura)/2);
}
}

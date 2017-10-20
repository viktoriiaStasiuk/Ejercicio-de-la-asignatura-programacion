/**
 * 17. Escribe un programa que diga cuál es la última cifra de un número
 *     entero introducido por teclado.
 *
 * @author Luis José Sánchez
 */
public class Ejercicio417 {

  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca el número entero para ver su última cifra: ");
    int x = Integer.parseInt(System.console().readLine());
    System.out.println("Es " + (x % 10));
  }
}

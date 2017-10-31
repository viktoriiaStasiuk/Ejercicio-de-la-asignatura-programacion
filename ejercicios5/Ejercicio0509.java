/**
 *9.Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 * 
 * @author Luis José Sánchez
 */

public class Ejercicio0509 {

  public static void main(String[] args) {
    
    int numeroDeDig = 1, n, numeroInt;

    System.out.print("Introduzca un número entero para ver cuántos dígitos contiene: ");
    numeroInt = Integer.parseInt(System.console().readLine());
    
    n = numeroInt;
    
    while (n > 10) {
      n /= 10;
      numeroDeDig++;
    }
    
    System.out.println(numeroInt + " contiene " + numeroDeDig + " dígitos.");

  }
}

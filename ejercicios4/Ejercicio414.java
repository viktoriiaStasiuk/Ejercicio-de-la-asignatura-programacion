/**
 *14.Realiza un programa que diga si un número introducido por teclado
 *es par y/o divisible entre 5.
 *
 * @author Luis José Sánchez
 */
public class Ejercicio414 {

  public static void main(String[] args) {
        
		System.out.println("Vamos a ver si un número introducido por teclado es par y/o divisible entre 5.");
	
		System.out.print("Por favor, introduzca el número: ");
    int x = Integer.parseInt(System.console().readLine());

    if ((x % 2) == 0) {
      System.out.print("Este número es par");
    } else {
      System.out.print("Este número es impar");
    }

    if ((x % 5) == 0) {
      System.out.println("Este número es divisible entre 5.");
    } else {
      System.out.println("Este número no es divisible entre 5.");
    }
  }
}

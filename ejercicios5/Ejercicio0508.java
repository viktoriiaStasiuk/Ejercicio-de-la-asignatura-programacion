/**
 *8.Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * @author Luis José Sánchez
 */
public class Ejercicio0508 {

  public static void main(String[] args) {
    
    System.out.print("Introduzca un número: ");
    int numInt = Integer.parseInt(System.console().readLine());
        
    for (int i = 0; i <= 10; i++) {
      System.out.println(numInt + " x " + i + " = " + numInt * i);
    }

  }
}

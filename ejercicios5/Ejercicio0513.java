/**
 *13.Escribe un programa que lea una lista de diez números y determine
 *cuántos son positivos, y cuántos son negativos.
 * 
 * @author Luis José Sánchez
 */

public class Ejercicio0513 {

  public static void main(String[] args) {
  
    System.out.println("Introduzca 10 números: ");

    int negativos = 0;
    int positivos = 0;
    
    for (int i = 0; i < 10; i++) {
      if (Integer.parseInt(System.console().readLine()) < 0) {
        negativos++;
      } else {
        positivos++;
      }
    }
    System.out.println("Son" + positivos + "positivos," + negativos + "negativos");

  }
}

/**
 *25.Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.
 *
 * @author Luis José Sánchez
 */
public class Ejercicio0525 {

  public static void main(String[] args) {

    System.out.println("Este programa muestre un número al revés del introducido por teclado");
    System.out.print("Introduzca un número entero: ");
    int numeroIntr = Integer.parseInt(System.console().readLine());

    int numero = numeroIntr;
    int volteado = 0;
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }
    System.out.println("El número al revés del número " + numeroIntr + " es " + volteado);
  }
}

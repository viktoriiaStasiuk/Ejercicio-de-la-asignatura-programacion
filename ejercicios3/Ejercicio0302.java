/**
 * 3. Lectura de datos desde teclado
 * 
 * 2. Realiza un conversor de euros a pesetas. La cantidad de euros que
 *    se quiere convertir debe ser introducida por teclado.
 *
 * @author Luis José Sánchez
 */

public class Ejercicio0302 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduce la cantidad de euros: ");
    double euros = Double.parseDouble(System.console().readLine());

    double pesetas = (double) (euros * 166.368);
    
    System.out.print(euros + " euros son " + pesetas + " pesetas");
  }
}

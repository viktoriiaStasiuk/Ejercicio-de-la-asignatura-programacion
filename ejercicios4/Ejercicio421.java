/**
 *
 * @author Luis José Sánchez
 */

public class Ejercicio421 {
  public static void main(String[] args) {

    System.out.print("Primer nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());

    System.out.print("Segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    double media = (nota1 + nota2) / 2;
    
    if (media < 5) {
      System.out.print("El resultado es: ");
      String recuperacion = System.console().readLine();
      if (recuperacion.equals("Apto")) {
        media = 5;
      }
    }
    
    System.out.print("Tu nota es " + media);
  }
}

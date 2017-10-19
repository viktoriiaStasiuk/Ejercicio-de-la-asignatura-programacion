/**
 * 8. Amplía el programa anterior para que diga la nota del boletín
 *(insuficiente, suficiente, bien, notable o sobresaliente).
 *
 * @author Luis José Sánchez
 */
public class Ejercicio408 {

  public static void main(String[] args) {

    System.out.println("Este programa calcula la media de tres notas.");
    
    System.out.print("Por favor, introduzca la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("introduzca la segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("introduzca la tercera nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());

    double media = (nota1 + nota2 + nota3) / 3;

    System.out.printf("La nota media será: ", media);
    
    if (media < 5) {
      System.out.println("Insuficiente");
    } else if (media < 6) {
      System.out.println("Aprobado");
    } else if (media < 7) {
      System.out.println("Bien");
    } else if (media < 9) {
      System.out.println("Notable");
    } else {
      System.out.println("Sobresaliente");
    }
  }
}

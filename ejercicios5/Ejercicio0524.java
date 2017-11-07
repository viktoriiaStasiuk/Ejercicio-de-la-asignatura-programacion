/**
 *24.Escribe un programa que lea un número N e imprima una pirámide de números con N filas como
 *     en la figura.
 *         
 * @author Luis José Sánchez
 */
public class Ejercicio0524 {

  public static void main(String[] args) {
    
    System.out.print("Introduzca la altura de la pirámide:");
    int alturaIntr = Integer.parseInt(System.console().readLine());

    int altura = 1;
    int i = 0;
    int espacios = alturaIntr - 1;
    
    while (altura <= alturaIntr) {
      
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      for (i = 1; i < altura; i++) {
        System.out.print(i);
      }
      for (i = altura; i > 0; i--) {
        System.out.print(i);
      }
      System.out.println();
      
      altura++;
      espacios--;
    } 
  }
}

/**
 *19.Realiza un programa que pinte una pirámide por pantalla. La altura
 *se debe pedir por teclado. El carácter con el que se pinta la pirámide
 *también se debe pedir por teclado.
 * 
 * @author Luis José Sánchez
 */
public class Ejercicio0519 {

  public static void main(String[] args) {
    
    System.out.print("Introduzca la altura de la pirámide: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca el carácter con el que se pinta la pirámide: ");
    String pinta = System.console().readLine();
    
    int altura = 1;
    int i = 0;
    int espacios = alturaIntroducida-1;
    
    while (altura <= alturaIntroducida) {
      
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      for (i = 1; i < altura * 2; i++) {
        System.out.print(pinta);
      }

      System.out.println();

      altura++;
      espacios--;
    }
  }
}

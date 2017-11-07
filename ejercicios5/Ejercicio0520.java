/**
 *20.Igual que el ejercicio anterior pero esta vez se debe pintar una
 *pirámide hueca.
 * 
 * @author Luis José Sánchez
 */
public class Ejercicio0520 {

  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int alturaInt = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca el carácter con el que se pinta la pirámide: ");
    String pinta = System.console().readLine();
    
    int altura = 1;
    int i = 0;
    int espacios = alturaInt - 1;
    int espaciosInt = 0;
    
    while (altura < alturaInt) {

      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      
      System.out.print(pinta);
      for (i = 1; i < espaciosInt; i++) {
        System.out.print(" ");
      }
      
      if (altura>1) {
        System.out.print(pinta);
      }
      
      System.out.println();
      altura++;
      espacios--;
      espaciosInt += 2;
    } 
    
    for (i = 1; i < altura*2; i++) {
      System.out.print(pinta);
    }
  }
}

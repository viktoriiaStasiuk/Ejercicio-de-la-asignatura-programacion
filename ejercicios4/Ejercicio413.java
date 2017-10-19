/**
 * 13. Escribe un programa que ordene tres números enteros introducidos por teclado.
 *
 * @author Luis José Sánchez
 */
public class Ejercicio413 {

  public static void main(String[] args) {
    
    int x;

		System.out.println("Vamos a ordenar tres números enteros introducidos por teclado");
	
		System.out.print("Por favor, introduzca el primer número entero: ");
    int a = Integer.parseInt(System.console().readLine());
		
		System.out.print("Por favor, introduzca el segundo número entero: ");
    int b = Integer.parseInt(System.console().readLine());
		
		System.out.print("Por favor, introduzca el tercer número entero ");
    int c = Integer.parseInt(System.console().readLine());

    if (a > b) {
      x = a;
      a = b;
      b = x;
    }
    
    if (b > c) {
      x = b;
      b = c;
      c = x;
    }
    
    if (a > b) {
      x = a;
      a = b;
      b = x;
    }
        
    System.out.println("Los tres números introducidos por teclado ordenados de menor a mayor son " + a + ", " + b + " y " + c + "."); 
  }
}

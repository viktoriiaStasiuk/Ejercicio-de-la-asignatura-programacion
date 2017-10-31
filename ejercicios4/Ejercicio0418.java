/**
 *
 * 18. Escribe un programa que diga cuál es la primera cifra de un número
 *     entero introducido por teclado. Se permiten números de hasta 5 cifras.
 *
 * @author Luis José Sánchez
 */
public class Ejercicio0418 {

  public static void main(String[] args) {
    
    int x, primera = 0;
    
    System.out.print("Por favor, introduzca un número entero hasta 5 cifras: ");
    x = Integer.parseInt(System.console().readLine());
    
    if ( x < 10 ) {
      primeraCifra = x;
    }
    
    if (( x >= 10 ) && ( x < 100 )) {
      primeraCifra = x / 10;
    }
    
    if (( x >= 100 ) && ( x < 1000 )) {
      primeraCifra = x / 100;
    }
    
    if (( x >= 1000 ) && ( x < 10000 )) {
      primeraCifra = x / 1000;
    }
    
    if ( x >= 10000 ) {
      primeraCifra = x / 10000;
    }
    
    System.out.println("La primera cifra del número es " + primeraCifra);
  }
}

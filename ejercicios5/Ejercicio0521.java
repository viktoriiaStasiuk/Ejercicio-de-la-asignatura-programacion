/**
 *21.Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y
 *nos diga cuantos números se han introducido, la media de los impares y el mayor de los pares.
 *El número negativo sólo se utiliza para indicar el final de la introducción de datos pero no
 *se incluye en el cómputo.
 * 
 * @author Luis José Sánchez
 */
public class Ejercicio0521 {

  public static void main(String[] args) {
    
    System.out.println("Por favor, introduzca números enteros.");
    System.out.println("Para terminar usa un número negativo.");

    int numeroInt;
    int numero = 0;
    int sumaImpares = 0;
    int numeroImpar = 0;
    int maximoPar = 0;
    
    do {
      numeroInt = Integer.parseInt(System.console().readLine());
      
      if (numeroInt >= 0) {
        numero++;
        if ((numeroInt % 2) == 1) { 
          sumaImpares += numeroInt;
          numeroImpar++;
        } else { 
          if (numeroInt > maximoPar)
            maximoPar = numeroInt;
        }
      }
    } while (numeroInt >= 0);

    System.out.println("Ha introducido " + numero + " números");
    System.out.println("La media de los impares es " + sumaImpares/numeroImpar);
    System.out.println("El mayor de los pares es " + maximoPar);
  }
}

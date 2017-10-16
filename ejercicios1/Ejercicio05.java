/**
 * 
 *
 * 5. Modifica el programa anterior añadiendo colores. Puedes mostrar
 *    cada asignatura de un color diferente.
 *
 * @author Luis José Sánchez
 */

public class Ejercicio05 {
  public static void main(String[] args) {

    String blanco = "\033[37m";
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String azul = "\033[34m";
    String naranja = "\033[33m";
    String celeste = "\033[36m";
    String morado = "\033[35m";
    

    System.out.println(naranja + "Lunes\tMartes\tMiérc.\tJueves\tViernes");
    System.out.println(verde + "SINF\tPRO\tSINF\tPRO" + rojo + "\tPRO");
    System.out.println(verde + "SINF\tPRO\tSINF\tPRO" + rojo + "\tPRO");
    System.out.println(celeste + "SINF" + rojo + "\tPRO\tSINF" + blanco + "\tPRO" + morado + "\tPRO");
    System.out.println(naranja + "FOL" + rojo + "\tBBDD\tED" + blanco + "\tLM" + morado + "\tED");
    System.out.println(naranja + "FOL" + morado + "\tBBDD" + celeste + "\tED" + morado + "\tBBDD" + celeste + "\tLM");
    System.out.println(naranja + "FOL" + morado + "\tBBDD" + celeste + "\tLM" + morado + "\tBBDD" + celeste + "\tLM");
  }
}

/**
 * 9. Escribe un programa que calcule el volumen de un cono según la
 *    fórmula V = (1/3)πr^2h
 *
 * @author Luis José Sánchez
 */

public class Ejercicio0309 {
  
  static final double pi = 3.141592654;
  
  public static void main(String[] args) {

    System.out.println("Volumen de un cono segun la fórmula");
    System.out.print("Introduzca la altura: ");
    double h = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca el radius: ");
    double r = Double.parseDouble(System.console().readLine());
    double v = (1.0/3.0) * pi * r * r * h;
    System.out.println("El volumen del cono es " +  v);
  }
}

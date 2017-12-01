/**
 *3.Escribe un programa que lea 10 números por teclado y que luego
 *los muestre en orden inverso, es decir, el primero que se
 *introduce es el último en mostrarse y viceversa.
 *
 */
public class Ejercicio0307 {

  public static void main(String[] args) {
    
    int[] num;
    num = new int[10];
    int i;
    
    System.out.println ("Introduzca 10 números pulsando Enter:");
    for (i = 0; i < 10; i++) {
    num [i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println("Los números introducidos en el orden inverso:");
    for (i = 9; i >= 0; i--) {
      
    System.out.println(num[i]);
    }
  }
}

    
    

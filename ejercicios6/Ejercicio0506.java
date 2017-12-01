/**
 *5.Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 *separados por espacios. Muestra el máximo, el mínimo y la media de esos números.
 *
 */
public class Ejercicio0506 {
  public static void main(String[] args) {
    
    int maximo = 100;
    int minimo = 199;
    int media = 0;
    int suma = 0;
    int n;
    
    for (int i = 0; i < 50; i++) {
      n = (int)(Math.random()*100) + 100;
      System.out.print(n + " ");
      suma += n;
      media = suma / 50;
      
      if (n < minimo) {
        minimo = n;
      }
      if (n > maximo) {
        maximo = n;
      }
      
    }
    System.out.println(" Mínimo: " + minimo + " Máximo: " + maximo + " Media: " + media);
  }
}

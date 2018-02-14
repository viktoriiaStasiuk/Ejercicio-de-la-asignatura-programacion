/** 
 * 5. Realiza un programa que rellene un array de 6 filas por 10 columnas
 *    con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
 *    A continuación, el programa deberá dar la posición tanto del máximo como del
 *    mínimo.
 * 
 */
public class Ej05 {

  public static void main(String[] args) 
    throws InterruptedException {
 
    int[][] num = new int[6][10];

    int fila;
    int columna;
 
    int minimo = Integer.MAX_VALUE;
    int filaMin = 0;
    int columnaMin = 0;
    
    int maximo = Integer.MIN_VALUE;
    int filaMax = 0;
    int columnaMax = 0;

    System.out.print("\n      ");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("   " + columna + "  ");
    }
    System.out.println();
    
    System.out.print("    ┌");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("──────");
    }
    System.out.println("┐");
    
    for(fila = 0; fila < 6; fila++) {
      System.out.print("  " + fila + " │");
      for(columna = 0; columna < 10; columna++) {
        num[fila][columna] = (int)(Math.random() * 1001);
        System.out.printf("%5d ", num[fila][columna]);
        Thread.sleep(100);
        
        if (num[fila][columna] < minimo) {
          minimo = num[fila][columna];
          filaMin = fila;
          columnaMin = columna;
        }
       
        if (num[fila][columna] > maximo) {
          maximo = num[fila][columna];
          filaMax = fila;
          columnaMax = columna;
        }
      }
      System.out.println("│");
    }
    System.out.print("    └");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("──────");
    }

    System.out.println("┘\n\nEl máximo es " + maximo + " y está en la fila " + filaMax + ", columna " + columnaMax);
    System.out.println("El mínimo es " + minimo + " y está en la fila " + filaMin + ", columna " + columnaMin);
  }
}

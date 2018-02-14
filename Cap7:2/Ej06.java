/**
 * 
 * 6. Modica el programa anterior de tal forma que no se repita ningún número en el array.
 * 
 */
public class Ej06 {

  public static void main(String[] args) 
    throws InterruptedException {
 
    int[][] num = new int[6][10];

    int fila;
    int columna;

    boolean repetido;
    int i;
    int j;
      
    for(fila = 0; fila < 6; fila++) {
      for(columna = 0; columna < 10; columna++) {
        do {
          num[fila][columna] = (int)(Math.random() * 1001);

          repetido = false;
          for (i = 0; i < 10 * fila + columna; i++) {
            if (num[fila][columna] == num[i / 10][i % 10]) {
              repetido = true;
            }
          }
        } while (repetido);
      }
    }

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

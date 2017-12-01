/**
 *7.Escribe un programa que muestre tres apuestas de la quiniela en
 *tres columnas para los partidos y el pleno al quince (15 filas).
 *
 */
public class Ejercicio0706 {
  public static void main(String[] args) {
    
    int elPartido;
    int columnas = 3;
    
    for (int fila = 1; fila <= 15; fila++) {
      System.out.printf("%4d. |", fila);
      
      if (fila == 15) {
        columnas = 1;
      }
      
      for (int apuesta = 1; apuesta <= columnas; apuesta++) {
        elPartido = (int)(Math.random() * 3) + 1;
        switch(elPartido) {
          case 1:
            System.out.print("1  |");
            break;
          case 2:
            System.out.print("  2|");
            break;
          case 3:
            System.out.print(" X |");
          default:
        }
      }
      System.out.println();
    }
  }
}

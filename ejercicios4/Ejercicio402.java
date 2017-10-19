/**
 * 2.Realiza un programa que pida una hora por teclado y que muestre
 * luego buenos días, buenas tardes o buenas noches según la hora.
 * Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5
 * respectivamente. Sólo se tienen en cuenta las horas, los minutos
 * no se deben introducir por teclado.
 *
 * @author Luis José Sánchez
 */

public class Ejercicio402 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca una hora del día (0 - 23): ");
    int horaDelDia = Integer.parseInt(System.console().readLine());
    
    if ((horaDelDia >= 6) && (horaDelDia <= 12)) {
      System.out.println("Buenos días");
    }
        
    if ((horaDelDia >= 13) && (horaDelDia <= 20)) {
      System.out.println("Buenas tardes");
    }
      
    if (((horaDelDia >= 21) && (horaDelDia < 24)) || ((horaDelDia <= 5) && (horaDelDia >= 0))) {
      System.out.println("Buenas noches");
    }
      
    if ((horaDelDia >= 24) || (horaDelDia < 0)) {
      System.out.println("La hora no existe.");
    }
  }
}

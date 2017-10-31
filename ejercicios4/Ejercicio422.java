/**
 *
 */

public class Ejercicio422 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca un día de la semana: ");
    String dia = System.console().readLine();

    int numeroDelDia = 0;

    switch(dia) {
      case "lunes":
        numeroDelDia = 0;
        break;
      case "martes":
        numeroDelDia = 1;
        break;
      case "miércoles":
        numeroDelDia = 2;
        break;
      case "jueves":
        numeroDelDia = 3;
        break;
      case "viernes":
        numeroDelDia = 4;
        break;
      default:
        System.out.print("No existe este día");
    }
    
    System.out.println("Introduzca la hora");
    
    System.out.print("Hora: ");
    int horas = Integer.parseInt(System.console().readLine());
    
    System.out.print("Minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int minutosTotales = (4 * 24 * 60) + (15 * 60);
    int minutosActuales = (numeroDelDia * 24 * 60) + (horas * 60) + minutos;
    
    System.out.print("Faltan " + (minutosTotales - minutosActuales) + " minutos para el fin de semana.");
  }
}

/**
 * 11.Escribe un programa que dada una hora determinada (horas y minutos),
 * calcule los segundos que faltan para llegar a la medianoche.
 *
 * @author Luis José Sánchez
 */
public class Ejercicio411 {

  public static void main(String[] args) {
    
    System.out.println("Vamos a calcular las segundos que faltan para llagar a la medianoche.");
    System.out.print("Introduzca la hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    if ((hora < 0) || (hora > 23) || (minutos < 0) || (minutos > 60));

    int segundosPorDia = 24 * 60 * 60;;
    int segundosDelUsuario = (hora * 60 * 60) + (minutos * 60);
    
    System.out.println("Hasta medianoche quedan " + (segundosPorDia - segundosDelUsuario));
            

  }
}

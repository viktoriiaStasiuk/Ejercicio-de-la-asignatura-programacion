/**
 * 11. Escribe un programa que dada una hora determinada (horas y minutos),
 *     calcule los segundos que faltan para llegar a la medianoche.
 *
 * @author Luis José Sánchez
 */
public class Ejercicio411 {

  public static void main(String[] args) {
    
    System.out.println("Vamos a calcular las segundos que faltan para llagar a la mediahora");
    System.out.print("Introduzca la hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());

    int segundosTranscurridos = (hora * 3600) + (minutos * 60);
    int segundosHastaMedianoche = (24 * 3600) - segundosTranscurridos;
    
    System.out.printf("Desde las" + hora + ":"  + minutos + "hasta la medianoche faltan" + segundosHastaMedianoche + "seguntos  ");
            

  }
}

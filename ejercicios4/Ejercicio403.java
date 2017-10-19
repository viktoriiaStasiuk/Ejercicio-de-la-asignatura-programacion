/**
 * 3.Escribe un programa en que dado un número del 1 a 7 escriba el
 * correspondiente nombre del día de la semana.
 *
 * @author Luis José Sánchez
 */

public class Ejercicio403 {
	public static void main(String[] args) {

		String diaDeSem;

		System.out.print("Por favor, introduzca un número del 1 al 7: ");
		int n = Integer.parseInt(System.console().readLine());
		
		switch(n) {
			case 1:
        diaDeSem = "lunes";
        break;
			case 2:
        diaDeSem = "martes";
        break;
			case 3:
        diaDeSem  = "miércoles";
        break;
			case 4:
        diaDeSem  = "jueves";
        break;
			case 5:
        diaDeSem  = "viernes";
        break;
			case 6:
        diaDeSem  = "sábado";
        break;
			case 7:
        diaDeSem  = "domingo";
        break;
			default:
        diaDeSem  = "Debe introducir un número del 1 al 7";
		}
		
		System.out.println(diaDeSem);

	}
}

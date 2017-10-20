/**
 * 15. Escribe un programa que pinte una pirámide rellena con un carácter
 *     introducido por teclado que podrá ser una letra, un número o un
 *     símbolo como *, +, -, $, &, etc. El programa debe permitir al
 *     usuario mediante un menú elegir si el vértice de la pirámide está
 *     apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la
 *     derecha.
 *
 * @author Luis José Sánchez
 */
public class Ejercicio415 {

	public static void main(String[] args) {
				
		System.out.println("Vamos a pintar una pirámide.");
		System.out.print("Introduzca un carácter: ");
		String n = System.console().readLine();
		System.out.println("Elija uno de cuatro tipos del vérticle de la pirámide");
		System.out.println("1. Hacia arriba");
		System.out.println("2. Hacia abajo");
		System.out.println("3. Hacia la izquierda");
		System.out.println("4. Hacia la derecha");
		int opcion = Integer.parseInt(System.console().readLine());

		switch(opcion) {
			case 1:
        System.out.println("  " + n);
        System.out.println(" " + n + n + n);
        System.out.println("" + n + n + n + n + n);
        break;
			case 2:
        System.out.println("" + n + n + n + n + n);
        System.out.println(" " + n + n + n);
        System.out.println("  " + n);
        break;
			case 3:
        System.out.println("    " + n);
        System.out.println("  " + n + " " + n);
        System.out.println(n + " " + n + " " + n);
        System.out.println("  " + n + " " + n);
        System.out.println("    " + n);
        break;
			case 4:
        System.out.println(n);
        System.out.println(n + " " + n);
        System.out.println(n + " " + n + " " + n);
        System.out.println(n + " " + n);
        System.out.println(n);
        break;
      default:
		}
	}
}

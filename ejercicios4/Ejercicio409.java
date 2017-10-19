/**
 * 9. Realiza un programa que resuelva una ecuación de segundo grado
 *(del tipo ax2 + bx + c = 0).
 *
 * @author Luis José Sánchez
 */
public class Ejercicio409 {

	public static void main(String[] args) {
        
    double x1;
    double x2;
    
    double a;
    double b; 
    double c;

		System.out.println("Vamos a resolver ecuación de segundo grado.");
		System.out.println("ax^2 + bx + c = 0");
	
		System.out.print("Por favor, introduzca el valore a = ");
		a = Double.parseDouble(System.console().readLine());
		
		System.out.print("Por favor, introduzca el valor b = ");
		b = Double.parseDouble(System.console().readLine());
		
		System.out.print("Por favor, introduzca el valor c = ");
		c = Double.parseDouble(System.console().readLine());
    
			double discriminante = b*b - (4 * a * c);
			
			if (discriminante < 0) {
					System.out.println("La ecuación no tiene solución");
      } else if ((a == 0) && (b == 0) && (c == 0)) {
			  System.out.println("La ecuación tiene infinitas soluciones.");
      } else if ((a != 0) && (b != 0) && (c != 0)) {
        System.out.println("x1 = " + (-b + Math.sqrt(discriminante))/(2 * a * c));
        System.out.println("x2 = " + (-b - Math.sqrt(discriminante))/(2 * a * c));
      } else if ((a != 0) && (b != 0) && (c == 0)) {
        System.out.println("x1 = 0");
        System.out.println("x2 = " + (-b/a));  
      } else if ((a == 0) && (b != 0) && (c != 0)) {
        System.out.print("X1 y X2 tienen el mismo valor que ");
      }
      else {
        System.out.println("x1 = " + (-b + Math.sqrt(discriminante))/(2 * a * c));
        System.out.println("x2 = " + (-b - Math.sqrt(discriminante))/(2 * a * c));
    }
					
	}
}

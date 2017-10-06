/**
 * Conversión de tipos
 *
 * @author Luis J. Sánchez
 */

public class eje255 {
  public static void main(String[] args) {

    int preciosiniva = 1353;
    double iva = (double)preciosiniva * 0.2;
    double totalfactura = preciosiniva + iva;
  
    System.out.printf("Precio sin iva :  " + preciosiniva + "€");   
    System.out.printf("iva :  " + iva + "€");   
  }
}

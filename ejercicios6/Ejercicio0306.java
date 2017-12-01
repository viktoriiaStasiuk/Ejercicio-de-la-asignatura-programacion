/**
 *3.Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de
 *48 cartas: 2, 3, 4, 5, 6, 7, 8, 9, sota, caballo, rey y as.
 *
 */
public class Ejercicio0306 {

  public static void main(String[] args) {
    
     String palo = "";
    String carta = "";
    
    int numeroPalo = (int)(Math.random()*4) + 1;
    
    switch(numeroPalo) {
      case 1:
        palo = "picas";
        break;
      case 2:
        palo = "corazones";
        break;
      case 3:
        palo = "diamantes";
        break;
      case 4:
        palo = "tréboles";
      default:
    }

    int numeroCarta = (int)(Math.random()*48) + 1;
    
    switch(numeroCarta) {
      case 1:
        carta = "Sota";
        break;
      case 11:
        carta = "Caballo";
        break;
      case 12:
        carta = "Rey";
        break;
      case 13:
        carta = "As";
        break;
      default:
        carta = String.valueOf(numeroCarta);
    }
    
    System.out.println(carta + " de " + palo);
  }
}

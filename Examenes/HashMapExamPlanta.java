/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmapexamplanta;

/**
 *
 * @author stasiuk.t
 */
import java.util.HashMap;
import java.util.Scanner;

public class HashMapExamPlanta {

    public static void main(String[] args) {

        HashMap<String, String> p = new HashMap<>();
        Scanner s = new Scanner(System.in);

        p.put("ortiga", "urtica dioica");
        p.put("romero", "rosmarinus officinalis");
        p.put("aloe vera", "aloe barbadensis miller");
        p.put("ayahuasca", "banisteriopsis caapi");

        HashMap<String, String> propiedad = new HashMap<>();

        propiedad.put("ortiga", "Es diurética y depurativa. Baja los niveles de colesterol.");
        propiedad.put("romero", "Tiene efectos estimulantes y tónicos, favorece en la recuperación de las enfermedades respiratorias y del aparato digestivo.");
        propiedad.put("aloe vera", "Regenera las células de la piel e incluso las de tejidos internos. Elimina hongos y virus. Protege el sistema inmunitario.");
        propiedad.put("ayahuasca", "Se usa en el tratamiento de la depresión y la ansiedad así como en los problemas de personalidad y esquizofrenia.");

        System.out.print("Por favor, introduzca el nombre de una planta: ");
        String planta = s.nextLine();

        if (p.containsKey(planta)) {
            System.out.print("Nombre científico: ");
            System.out.println(p.get(planta));
            System.out.print("Propiedades: ");
            System.out.println(propiedad.get(planta));
        } else {
            System.out.print("Lo siento, ese planta no existe");
        }
    }

}

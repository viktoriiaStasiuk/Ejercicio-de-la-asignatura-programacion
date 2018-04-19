/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej06;

/**
 *
 * @author stasiuk.t
 */
import java.util.HashMap;
import java.util.Scanner;

public class Ej06 {

    public static void main(String[] args) {
        HashMap<String, String> p = new HashMap<>();
        Scanner s = new Scanner(System.in);

        p.put("usuario1", "001zxc");
        p.put("usuario2", "qwerty123");
        p.put("usuario3", "03bnmH");
        p.put("usuario4", "iopK8vc");

        System.out.print("Por favor, introduzca el nombre de usuario: ");
        String usuario = s.nextLine();

        boolean acceso = false;
        int oportunidades = 3;
        do {
            System.out.print("Por favor, introduzca la contraseña: ");
            String contrasenia = s.nextLine();
            if (p.containsKey(usuario)) {
                if (p.get(usuario).equals(contrasenia)) {
                    acceso = true;
                    System.out.println("Ha accedido al área restringida");
                } else {
                    System.out.println("La contraseña es incorrecta");
                }
            }
            oportunidades--;
            if (!acceso && (oportunidades > 0)) {
                System.out.print("Hay " + oportunidades + " oportunidades más. ");
            }
        } while ((!acceso) && (oportunidades > 0));

        if (!acceso) {
            System.out.println("Lo siento, no tiene acceso al área restringida");
        }

    }

}

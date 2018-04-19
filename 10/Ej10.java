/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author stasiuk.t
 */
public class Ej10 {

    public static void main(String[] args) {
        HashMap<String, String> d = new HashMap<>();
        Scanner s = new Scanner(System.in);

        d.put("libro", "book");
        d.put("chico", "boy");
        d.put("rojo", "red");
        d.put("sol", "sun");
        d.put("mesa", "table");
        d.put("ordenador", "computer");
        d.put("ciudad", "city");
        d.put("naranja", "orange");
        d.put("agua", "water");
        d.put("manzana", "apple");
        d.put("amistad", "friendship");
        d.put("vida", "life");
        d.put("trabajo", "work");
        d.put("familia", "family");
        d.put("bolsa", "bag");
        d.put("mensaje", "message");
        d.put("hermana", "sister");
        d.put("plato", "dish");
        d.put("viaje", "travel");
        d.put("gato", "cat");

        System.out.print("Por favor, introduzca una palabra en español: ");
        String palabra;
        palabra = s.nextLine();

        if (d.containsKey(palabra)) {
            System.out.print("La palabra " + palabra + " en inglés es ");
            System.out.println(d.get(palabra));
        } else {
            System.out.print("Esta palabra no existe en el diccionario.");
        }
    }
}

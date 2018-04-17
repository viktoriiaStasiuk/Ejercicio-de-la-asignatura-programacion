/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmapexamcolor;

/**
 *
 * @author stasiuk.t
 */
import java.util.HashMap;
import java.util.Scanner;

public class HashMapExamColor {

    public static void main(String[] args) {

        HashMap<String, String> c = new HashMap<>();
        Scanner s = new Scanner(System.in);

        c.put("azul", "Blue");
        c.put("negro", "Black");
        c.put("rojo", "Red");
        c.put("blanco", "White");
        c.put("verde", "Green");
        c.put("morado", "Purple");
        c.put("amarillo", "Yellow");
        c.put("naranja", "Orange");
        c.put("rosa", "Violet");

        HashMap<String, String> rgb = new HashMap<>();

        rgb.put("azul", "#0000FF");
        rgb.put("negro", "#000000");
        rgb.put("rojo", "#FF0000");
        rgb.put("blanco", "#FFFFFF");
        rgb.put("verde", "#008000");
        rgb.put("morado", "#800080");
        rgb.put("amarillo", "#FFFF00");
        rgb.put("naranja", "#FFA500");
        rgb.put("rosa", "#EE82EE");

        System.out.print("Por favor, introduzca un color: ");
        String color = s.nextLine();

        if (c.containsKey(color)) {
            System.out.print("El color " + color + "en inglés es ");
            System.out.println(c.get(color));
            System.out.print("y su código RGB es ");
            System.out.println(rgb.get(color));
        } else {
            System.out.print("Lo siento, ese color no existe");
        }

    }
}

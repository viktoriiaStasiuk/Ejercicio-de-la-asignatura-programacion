/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author stasiuk.t
 */
public class Ej11 {

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

        int num;
        int i;

        ArrayList<String> dic = new ArrayList<>();

        for (Object o : d.keySet().toArray()) {
            dic.add(o.toString());
        }
        // dic.get((int)(Math.random()*20));
        /*for (i = 0; i < 5; i++) {
            num = (int) (Math.random() * 20);
            //System.out.println(dic.get(num));
        }*/
        //System.out.println(dic);
        int numero = 0;
        System.out.println("Traduzca al inglés las siguientes palabras: ");
        for (i = 0; i < 5; i++) {
            num = (int) (Math.random() * 20);
            System.out.print(dic.get(num) + ": ");
            String t = s.nextLine();
            if (t.equals(d.get(dic.get(num)))) {
                System.out.println("Respuesta correcta");
                numero++;
            } else {
                System.out.println("Respuesta incorrecta");
                System.out.println("La respuesta correcta es " + d.get(dic.get(i)));
            }
            
        }
        System.out.println("Las respuestas correctas son: " + numero);
    }
}

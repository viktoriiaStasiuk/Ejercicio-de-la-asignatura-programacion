/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej03;

/**
 *
 * @author stasiuk.t
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ej03 {
  public static void main(String[] args) {

    ArrayList<Integer> a = new ArrayList<>();
    
    Scanner entrada = new Scanner(System.in);

    System.out.println("Introduzca 10 números enteros por teclado: ");
    
    for (int i = 0; i < 10; i++) {
     int x = Integer.parseInt(entrada.nextLine());
     a.add(x);
    }   

    System.out.println("Lista original: " + a);

    Collections.sort(a); //importante

    System.out.println("Lista ordenada: " + a);
  }
}

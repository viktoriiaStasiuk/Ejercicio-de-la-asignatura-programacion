/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej04;

/**
 *
 * @author stasiuk.t
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ej04 {
  public static void main(String[] args) {

  ArrayList<String> a = new ArrayList<String>();
  
  Scanner palabra = new Scanner(System.in);

  System.out.println("Introduzca 10 palabras: ");
  for (int i = 0; i < 10; i++) {
    String x = palabra.nextLine();
    a.add(x);  
  }   

  System.out.println("\nLista original:\n" + a);

  Collections.sort(a);

  System.out.println("\nLista ordenada alfabéticamente:\n" + a);
  }
}
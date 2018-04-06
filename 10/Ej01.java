/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej01;

/**
 *
 * @author stasiuk.t
 */

import java.util.ArrayList;

public class Ej01 {
  public static void main(String[] args) {
    
    ArrayList<String> a = new ArrayList<String>();

    a.add("Sara");
    a.add("Anabel");
    a.add("Adrián");
    a.add("Alejandro");
    a.add("David");
    a.add("Daniel");

    System.out.println("Contenido de la lista: ");

    for(String alumno : a) {
      System.out.println(alumno);
    }
  }
    
}

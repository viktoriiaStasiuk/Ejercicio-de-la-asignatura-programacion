/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej02;

/**
 *
 * @author stasiuk.t
 */

import java.util.ArrayList;

public class Ej02 {
  public static void main(String[] args) {

    int suma = 0;
    int minimo = 100;
    int maximo = 0;
    int media;
    int cantidadDeNumeros = (int)(Math.random() * 11 + 10);

    ArrayList<Integer> a = new ArrayList<Integer>();

    for (int i = 0; i < cantidadDeNumeros; i++) {
      a.add((int)(Math.random()*101));
    }

    System.out.println("Lista generada: " + a);

    for(int n : a) {       
      suma += n;  
      
      minimo = (n < minimo) ? n : minimo;
      //if(n < minimo) {
      //minimo = n;
      //}
      maximo = (n > maximo) ? n : maximo;
      //if(n > maximo) {
      //maximo = n;
      //}
     } 
    
    media = suma / cantidadDeNumeros;

    System.out.println("La suma es : " + suma);
    System.out.println("La media es : " + media);
    System.out.println("El mínimo es : " + minimo);
    System.out.println("El máximo es : " + maximo);         
  }
}

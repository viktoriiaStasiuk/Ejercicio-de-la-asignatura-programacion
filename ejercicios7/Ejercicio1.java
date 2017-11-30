/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7;

/**
 *
 * @author stasiuk.t
 */
public class Ejercicio1 {
    
public static void main(String[] args) {
    int[] num;
    num = new int[12];
    
    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;
    
    System.out.println("El array contiene los siguientes elementos:");
    
    for (int i = 0; i < 12; i++) {
    System.out.printf("num[%2d]: %3d; ", i, num[i]);
    }
  }
}


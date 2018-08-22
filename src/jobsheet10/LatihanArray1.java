/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;

import java.util.Scanner;

/**
 *
 * @author galih
 */
public class LatihanArray1 {
  public static void main(String[] args){
      Scanner input =  new Scanner(System.in);
      //membuat array
      String [] nama = {"moch", "ammad", "galih", "praka", "siwi"};
      
      System.out.print("Masukkan Indeks : ");
      String pilihan = input.next();
      System.out.println(nama);
  }
}

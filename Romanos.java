/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Usher
 */
public class Romanos {

String representacionRomana = "";
public String convertirRomano(int numero) {
  int i, miles, centenas, decenas, unidades;
    
      
      //obtenemos cada cifra del número
      miles = numero / 1000;
      centenas = numero / 100 % 10;
      decenas = numero / 10 % 10;
      unidades = numero % 10;

      //millar
      for (i = 1; i <= miles; i++) {
             representacionRomana = representacionRomana + "M";
      }

      //centenas
      if (centenas == 9) {
          representacionRomana = representacionRomana + "CM";
      } else if (centenas >= 5) {
                 representacionRomana = representacionRomana + "D";
                 for (i = 6; i <= centenas; i++) {
                      representacionRomana = representacionRomana + "C";
                 }
      } else if (centenas == 4) {
                 representacionRomana = representacionRomana + "CD";
      } else {
                 for (i = 1; i <= centenas; i++) {
                      representacionRomana = representacionRomana + "C";
             }
      }

      //decenas
      if (decenas == 9) {
          representacionRomana = representacionRomana + "XC";
      } else if (decenas >= 5) {
                 representacionRomana = representacionRomana + "L";
                 for (i = 6; i <= decenas; i++) {
                      representacionRomana = representacionRomana + "X";
                 }
      } else if (decenas == 4) {
                 representacionRomana = representacionRomana + "XL";
      } else {
                 for (i = 1; i <= decenas; i++) {
                      representacionRomana = representacionRomana + "X";
                 }
      }

      //unidades
      if (unidades == 9) {
          representacionRomana = representacionRomana + "IX";
      } else if (unidades >= 5) {
                 representacionRomana = representacionRomana + "V";
                 for (i = 6; i <= unidades; i++) {                                                           
                      representacionRomana = representacionRomana + "I";
                 }
      } else if (unidades == 4) {
                 representacionRomana = representacionRomana + "IV";
      } else {
                 for (i = 1; i <= unidades; i++) {
                      representacionRomana = representacionRomana + "I";
                 }
      }
      return representacionRomana;
  }

   
   public static void main(String args[]) 
{
    Romanos r = new Romanos();
    int NumeroAconvertir;
    System.out.println("Introduzca el numero que decea convertir:");
    Scanner sc = new Scanner(System.in);
    NumeroAconvertir= sc.nextInt();
    r.convertirRomano(NumeroAconvertir);
    System.out.println(r.representacionRomana);
   
}

  
   
}
 

    
   
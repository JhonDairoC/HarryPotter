package org.example;

import java.util.Scanner;

abstract class Sombrero {
     Scanner sc = new Scanner(System.in);
     static boolean bol = false;

     static int probCasa = 0;
     abstract String pregunta();

     static void option(String scan){
          switch(scan){
               case "1", "2", "3", "4":
                    bol = false;
                    break;
               default:
                    bol = true;
          }
     }

      boolean getBol(){
          return bol;
     }
     static int getProbCasa(){
         return probCasa * 100 / 4;
     }
     void setProbCasa(int probCasa){
          this.probCasa += probCasa;
     }
}

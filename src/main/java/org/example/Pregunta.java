package org.example;

import java.util.Scanner;

class Pregunta {
     protected Scanner sc = new Scanner(System.in);
     private static boolean bol = false;
     protected String res;
     private static int probCasa = 0;

      void option(String scan){
          switch(scan){
               case "1", "2", "3", "4":
                    bol = false;
                    break;
               default:
                    bol = true;
          }
     }

     public boolean getBol(){
          return bol;
     }
     public int getProbCasa(){
         return probCasa;
     }
     public void setProbCasa(int probCasa){
          this.probCasa += probCasa;
     }
}

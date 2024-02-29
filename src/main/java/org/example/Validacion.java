package org.example;

class Validacion {
     private static boolean bol = false;
     private String eleccion;
     private int probCasa = 0;

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

     public String getEleccion(){
           return eleccion;
     }
     public void setEleccion(String eleccion){this.eleccion = eleccion;}
}

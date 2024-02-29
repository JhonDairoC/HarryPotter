package org.example;

class Validacion {
     private static boolean bol = true;
     private static boolean validation = true;
     private String eleccion;
     private StringBuilder mensajeValidacion = new StringBuilder("-------------------------------------------------");
     private int probCasa = 0;

      void option(String scan){
          switch(scan){
               case "1", "2", "3", "4":
                    bol = false;
                   mensajeValidacion = new StringBuilder("-------------------------------------------------");
                    break;
               default:
                    bol = true;
                   mensajeValidacion = new StringBuilder("Digita un numero del 1 al 4");
          }
     }
    void siguiente(String scan){
        switch(scan){
            case "0":
                bol = false;
                validation = false;
                break;
            case "1":
                bol = true;
                validation = false;
                probCasa = 0;
                break;
            default:
                validation = true;
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
    public boolean getValidation(){return validation;}

    public StringBuilder getMensajeValidacion(){
          return mensajeValidacion;
    }
}

package org.example;

import java.sql.SQLOutput;

import static org.example.Sombrero.getProbCasa;

public class Main {
    static int casa;
    static StringBuilder result = new StringBuilder();
    public static void main(String[] args) {
        respuesta(new Gryffindor());
        respuesta(new Hufflepuff());
        respuesta(new Ravenclaw());
        respuesta(new Slytherin());
        casa();
    }

    static void respuesta(Sombrero sombrero) {
        sombrero.pregunta();
    }


    static void casa(){
        int i = getProbCasa();
        if(i >= 300){
            System.out.println("Casa Gryffindor");
        } else if (i >= 260) {
            System.out.println("Casa Slytherin");
        } else if (i>=230) {
            System.out.println("Casa Ravenclaw");
        }else {
            System.out.println("Casa Hufflepuff");
        }
    }
}
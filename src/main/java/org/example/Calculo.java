package org.example;

public class Calculo {
    void calculoCasa(int i){
        i = (i * 100) / 4;
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

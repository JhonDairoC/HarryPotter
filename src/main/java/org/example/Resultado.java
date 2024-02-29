package org.example;

public class Resultado {
    void calculoResultado(int i){
        i = (i * 100) / 4;
        if(i >= 300){
            System.out.println("Perteneces a la casa Gryffindor");
        } else if (i >= 260) {
            System.out.println("Perteneces a la casa Slytherin");
        } else if (i>=230) {
            System.out.println("Perteneces a la casa Ravenclaw");
        }else {
            System.out.println("Perteneces a la casa Hufflepuff");
        }
    }
}

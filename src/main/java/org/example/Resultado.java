package org.example;

public class Resultado {
    void calculoResultado(int i){
        i = (i * 100) / 4;
        if(i >= 200){
            System.out.println("Perteneces a la casa Gryffindor");
        } else if (i >= 170) {
            System.out.println("Perteneces a la casa Slytherin");
        } else if (i>=140) {
            System.out.println("Perteneces a la casa Ravenclaw");
        }else {
            System.out.println("Perteneces a la casa Hufflepuff");
        }
    }
}

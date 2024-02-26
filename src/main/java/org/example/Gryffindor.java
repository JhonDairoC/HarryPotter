package org.example;

import java.util.Scanner;

public class Gryffindor extends Sombrero {
    String res;
    @Override
    public String pregunta(){
        do {
            System.out.println("¿Cómo sueles afrontar situaciones difíciles?");
            System.out.println("1. Con optimismo creo que siempre hay una solución");
            System.out.println("2. Con independencia confío en mi capacidad para superar cualquier obstáculo");
            System.out.println("3. Con análisis examino la situación cuidadosamente y busco la mejor solución posible");
            System.out.println("4. Con amabilidad creo que la bondad es la mejor manera de resolver los conflictos");
            res = sc.nextLine();
            option(res);
        } while (getBol());
            if(res.equals("1")){
                setProbCasa(6);
            }else{
                setProbCasa(2);
            }
            return res;
    }

}

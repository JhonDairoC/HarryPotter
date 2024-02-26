package org.example;

import java.util.Scanner;

public class Ravenclaw extends Sombrero{
    String res;
    @Override
    public String pregunta(){
        do {
            System.out.println("¿Qué tipo de roles te gusta asumir en los grupos?");
            System.out.println("1. Lider");
            System.out.println("2. Negociador");
            System.out.println("3. Analista");
            System.out.println("4. Mediador");
            res = sc.nextLine();
            Sombrero.option(res);
        }while (getBol());
        if(res.equals("3")){
            setProbCasa(4);
        }else{
            setProbCasa(2);
        }
        return res;
    }
}

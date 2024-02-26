package org.example;

import java.util.Scanner;

public class Hufflepuff extends Sombrero{
    String res;
    @Override
    public String pregunta(){
        do {
            System.out.println("¿Qué cualidades admiras más en las personas?");
            System.out.println("1. Admiro a las personas que son valientes");
            System.out.println("2. Admiro a las personas que son ambiciosas y que se esfuerzan por alcanzar sus objetivos");
            System.out.println("3. Admiro a las personas que son curiosas y que siempre están buscando aprender cosas nuevas");
            System.out.println("4. Admiro a las personas que son pacientes y tolerantes, y que son capaces de mantener la calma en situaciones difíciles");
            res = sc.nextLine();
            Sombrero.option(res);
        }while (getBol());
            if(res.equals("4")){
                setProbCasa(3);
            }else{
                setProbCasa(2);
            }
            return res;
    };
}

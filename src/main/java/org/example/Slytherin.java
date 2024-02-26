package org.example;

import java.util.Scanner;

public class Slytherin extends Sombrero{
    String res;
    @Override
    public String pregunta(){
        do {
            System.out.println("¿Qué tipo de problemas te gusta resolver?");
            System.out.println("1. Problemas Injustos");
            System.out.println("2. Problemas que tienen un beneficio personal");
            System.out.println("3. Problemas misteriosos");
            System.out.println("4. Problemas que afectan a la comunidad");
            res = sc.nextLine();
            Sombrero.option(res);
        }while (getBol());
        if(res.equals("2")){
            setProbCasa(5);
        }else{
            setProbCasa(2);
        }
        return res;
    }
}

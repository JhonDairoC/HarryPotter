package org.example;

public class Respuesta extends Pregunta {
    public void obtRespuesta(){
        do {
            System.out.println("¿Cómo sueles afrontar situaciones difíciles?");
            System.out.println("1. Con optimismo creo que siempre hay una solución");
            System.out.println("2. Con independencia confío en mi capacidad para superar cualquier obstáculo");
            System.out.println("3. Con análisis examino la situación cuidadosamente y busco la mejor solución posible");
            System.out.println("4. Con amabilidad creo que la bondad es la mejor manera de resolver los conflictos");
            res = sc.nextLine();
            option(res);
            if(res.equals("1")){
                setProbCasa(6);
            }else{
                setProbCasa(2);
            }
        } while (getBol());


        do {
            System.out.println("¿Qué cualidades admiras más en las personas?");
            System.out.println("1. Admiro a las personas que son valientes");
            System.out.println("2. Admiro a las personas que son ambiciosas y que se esfuerzan por alcanzar sus objetivos");
            System.out.println("3. Admiro a las personas que son curiosas y que siempre están buscando aprender cosas nuevas");
            System.out.println("4. Admiro a las personas que son pacientes y tolerantes, y que son capaces de mantener la calma en situaciones difíciles");
            res = sc.nextLine();
            option(res);
            if(res.equals("4")){
                setProbCasa(3);
            }else{
                setProbCasa(2);
            }
        }while (getBol());


        do {
            System.out.println("¿Qué tipo de roles te gusta asumir en los grupos?");
            System.out.println("1. Lider");
            System.out.println("2. Negociador");
            System.out.println("3. Analista");
            System.out.println("4. Mediador");
            res = sc.nextLine();
            option(res);
            if(res.equals("3")){
                setProbCasa(4);
            }else{
                setProbCasa(2);
            }
        }while (getBol());


        do {
            System.out.println("¿Qué tipo de problemas te gusta resolver?");
            System.out.println("1. Problemas Injustos");
            System.out.println("2. Problemas que tienen un beneficio personal");
            System.out.println("3. Problemas misteriosos");
            System.out.println("4. Problemas que afectan a la comunidad");
            res = sc.nextLine();
            option(res);
            if(res.equals("2")){
                System.out.println(getProbCasa());
            }else{
                setProbCasa(2);
            }
        }while (getBol());

    }
}

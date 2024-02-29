package org.example;

import java.util.Scanner;

public class PuntajeRespuestas extends Validacion {
    private Scanner sc = new Scanner(System.in);
    public void obtRespuesta(){
        do {
            Preguntas_Respuestas.GRYFFINDOR.getPreguntas();
            setEleccion(sc.nextLine());
            option(getEleccion());
            if(getEleccion().equals("1")){
                setProbCasa(6);
            }else{
                setProbCasa(2);
            }
        } while (getBol());

        do {
            Preguntas_Respuestas.SLYTHERIN.getPreguntas();
            setEleccion(sc.nextLine());
            option(getEleccion());
            if(getEleccion().equals("4")){
                setProbCasa(3);
            }else{
                setProbCasa(2);
            }
        }while (getBol());

        do {
            Preguntas_Respuestas.RAVENCLAW.getPreguntas();
            setEleccion(sc.nextLine());
            option(getEleccion());
            if(getEleccion().equals("3")){
                setProbCasa(4);
            }else{
                setProbCasa(2);
            }
        }while (getBol());

        do {
            Preguntas_Respuestas.HUFFLEPUFF.getPreguntas();
            setEleccion(sc.nextLine());
            option(getEleccion());
            if(getEleccion().equals("2")){
                System.out.println(getProbCasa());
            }else{
                setProbCasa(2);
            }
        }while (getBol());

    }
}

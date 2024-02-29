package org.example;

import java.util.Scanner;

public class PuntajeRespuestas extends Validacion {
    private Scanner sc = new Scanner(System.in);
    public void obtRespuesta(){
        do {
            do {
                System.err.println(getMensajeValidacion());
                Preguntas_Respuestas.GRYFFINDOR.getPreguntas();
                setEleccion(sc.nextLine());
                option(getEleccion());
                if (getEleccion().equals("1")) {
                    setProbCasa(5);
                } else {
                    setProbCasa(1);
                }
            } while (getBol());

            do {
                System.err.println(getMensajeValidacion());
                Preguntas_Respuestas.SLYTHERIN.getPreguntas();
                setEleccion(sc.nextLine());
                option(getEleccion());
                if (getEleccion().equals("4")) {
                    setProbCasa(2);
                } else {
                    setProbCasa(1);
                }
            } while (getBol());

            do {
                System.err.println(getMensajeValidacion());
                Preguntas_Respuestas.RAVENCLAW.getPreguntas();
                setEleccion(sc.nextLine());
                option(getEleccion());
                if (getEleccion().equals("3")) {
                    setProbCasa(3);
                } else {
                    setProbCasa(1);
                }
            } while (getBol());

            do {
                System.err.println(getMensajeValidacion());
                Preguntas_Respuestas.HUFFLEPUFF.getPreguntas();
                setEleccion(sc.nextLine());
                option(getEleccion());
                if (getEleccion().equals("2")) {
                    setProbCasa(4);
                } else {
                    setProbCasa(1);
                }
            } while (getBol());

            Resultado resultado = new Resultado();
            resultado.calculoResultado(getProbCasa());
            do{
                System.out.println("\nSi deseas salir del programa digita el numero '0'");
                System.out.println("Si deseas continuar digita '1'");
                setEleccion(sc.nextLine());
                siguiente(getEleccion());
            }while(getValidation());

        }while (getBol());
    }
}

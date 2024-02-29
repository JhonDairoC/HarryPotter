package org.example;

public class Main {
    public static void main(String[] args) {
        PuntajeRespuestas respuesta = new PuntajeRespuestas();
        respuesta.obtRespuesta();
        Resultado resultado = new Resultado();
        resultado.calculoResultado(respuesta.getProbCasa());
    }

}
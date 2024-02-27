package org.example;

public class HarryPotter {
    public static void main(String[] args) {
        Respuesta respuesta = new Respuesta();
        respuesta.obtRespuesta();
        new Calculo().calculoCasa(respuesta.getProbCasa());
    }

}
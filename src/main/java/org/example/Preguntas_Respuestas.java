package org.example;

public enum Preguntas_Respuestas {
    GRYFFINDOR("¿Cómo sueles afrontar situaciones difíciles?",
            "1. Con optimismo creo que siempre hay una solución",
            "2. Con independencia confío en mi capacidad para superar cualquier obstáculo",
            "3. Con análisis examino la situación cuidadosamente y busco la mejor solución posible",
            "4. Con amabilidad creo que la bondad es la mejor manera de resolver los conflictos"
    ),

    SLYTHERIN("¿Qué cualidades admiras más en las personas?",
            "1. Admiro a las personas que son valientes",
            "2. Admiro a las personas que son ambiciosas y que se esfuerzan por alcanzar sus objetivos",
            "3. Admiro a las personas que son curiosas y que siempre están buscando aprender cosas nuevas",
            "4. Admiro a las personas que son pacientes y tolerantes, y que son capaces de mantener la calma en situaciones difíciles"
    ),

    RAVENCLAW("¿Qué tipo de roles te gusta asumir en los grupos?",
            "1. Lider",
            "2. Negociador",
            "3. Analista",
            "4. Mediador"
    ),

    HUFFLEPUFF("¿Qué tipo de problemas te gusta resolver?",
            "1. Problemas Injustos",
            "2. Problemas que tienen un beneficio personal",
            "3. Problemas misteriosos",
            "4. Problemas que afectan a la comunidad"
    );

    private String pregunta;
    private String respuesta1;
    private String respuesta2;
    private String respuesta3;
    private String respuesta4;
    Preguntas_Respuestas(String pregunta, String r1, String r2, String r3, String r4) {
        this.pregunta = pregunta;
        this.respuesta1 = r1;
        this.respuesta2 = r2;
        this.respuesta3 = r3;
        this.respuesta4 = r4;
    }

    public void getPreguntas(){
        System.out.println(pregunta);
        System.out.println(respuesta1);
        System.out.println(respuesta2);
        System.out.println(respuesta3);
        System.out.println(respuesta4);

    }
}

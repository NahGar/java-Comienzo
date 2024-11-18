package org.ngarcia.string;

public class StringInmutable {

    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        curso.concat(profesor); //concat no toca a curso, devuelve la concatenación
        System.out.println("curso:"+curso);

        String resultadoConcat = curso.concat(profesor);
        System.out.println("curso:"+resultadoConcat);

        curso.transform( (c) -> {
           return  c + " con " + profesor;
        });
        System.out.println("curso:"+curso);
        String resultadoTransform = curso.transform( (c) -> {
            return  c + " con " + profesor;
        });
        System.out.println("curso:"+resultadoTransform);

        resultadoConcat.replace("a", "A");
        System.out.println("curso:"+resultadoConcat);

        String resultadoReplace = resultadoConcat.replace("a", "A");
        System.out.println("curso:"+resultadoReplace);
    }
}

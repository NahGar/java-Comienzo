package org.ngarcia.Argumentos;

public class ArgumentosLineaComando {

    public static void main(String[] args) {

        //si hay problema con tildes al compilar se puede poner
        // javac ArgumentosLineaComando.java -encoding utf8

        if( args.length == 0 ) {
            System.out.println("Debe ingresar algún parámetro");
            System.exit(-1);
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("arg " + args[i]);
        }
    }
}

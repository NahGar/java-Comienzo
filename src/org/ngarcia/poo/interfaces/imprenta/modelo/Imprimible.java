package org.ngarcia.poo.interfaces.imprenta.modelo;

public interface Imprimible {

    //final static String TEXTO_DEFECTO = "Imprimiendo valor por defecto";
    String TEXTO_DEFECTO = "Imprimiendo valor por defecto";

    //este método obliga a que las clases que implementen imprimir
    //String imprimir();

    //comportamiento default para no obligar a las clases que implementan Imprimible a implementar imprimir
    default String imprimir() {
        return TEXTO_DEFECTO;
    }

    static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }

}

package org.ngarcia.patrones_diseno.observer;

public class Ejecutar {
    public static void main(String[] args) {

        Corporacion google = new Corporacion("Google",1000);
        google.addObserver( (observable, obj) -> {
            System.out.println("John: " + observable);
        });

        google.addObserver( (observable, obj) -> {
            System.out.println("Roberto: " + observable);
        });

        google.modificaPrecio(2000);
        google.modificaPrecio(1000);
    }
}

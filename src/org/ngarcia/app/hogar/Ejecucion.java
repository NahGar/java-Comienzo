package org.ngarcia.app.hogar;

import org.ngarcia.app.jardin.Perro;
import static org.ngarcia.app.hogar.Persona.saludar;

public class Ejecucion {

    public static void main(String[] args) {

        Persona persona = new Persona();
        Perro perro = new Perro();
        //perro.jugar(); //no puede jugar() porque es default
        System.out.println(saludar());

    }
}

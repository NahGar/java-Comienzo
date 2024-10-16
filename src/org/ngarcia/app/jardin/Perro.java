package org.ngarcia.app.jardin;

import org.ngarcia.app.hogar.Persona;

public class Perro {
    String nombre; //se pueden usar dentro del package
    String raza; //se pueden usar dentro del package
    protected String otro; //también se puede utilizar dentro del package

    String jugar(Persona persona) {
        return persona.lanzarPelota();
    }
}

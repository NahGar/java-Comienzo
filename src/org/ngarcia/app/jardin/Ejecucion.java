package org.ngarcia.app.jardin;

//import org.ngarcia.app.hogar.Gato;
//import org.ngarcia.app.hogar.Persona;
import org.ngarcia.app.hogar.*;

public class Ejecucion {

    public static void main(String[] args) {
        //org.ngarcia.app.hogar.Persona persona = new org.ngarcia.app.hogar.Persona();
        Persona persona = new Persona();
        persona.setNombre("Pepe");
        System.out.println(persona.getNombre());

        Perro perro = new Perro();
        //nombre y raza no son public pero se pueden usar dentro del mismo package
        perro.nombre = "Tobby";
        perro.raza = "Bulldog";
        System.out.println(perro.jugar(persona));
    }
}

package org.ngarcia.app.jardin;

//import org.ngarcia.app.hogar.Gato;
//import org.ngarcia.app.hogar.Persona;
import org.ngarcia.app.hogar.*;
import static org.ngarcia.app.hogar.ColorPeloEnum.*;
import static org.ngarcia.app.hogar.Persona.saludar;
import static org.ngarcia.app.hogar.Persona.GENERO_MASCULINO;

public class Ejecucion {

    public static void main(String[] args) {
        //org.ngarcia.app.hogar.Persona persona = new org.ngarcia.app.hogar.Persona();
        Persona persona = new Persona();
        persona.setNombre("Pepe");
        persona.setApellido("Mujica");
        persona.setColorPelo(NEGRO);
        System.out.println("Nombre:" + persona.getNombre() + " " + 
                            persona.getApellido() + " " +
                            persona.getColorPelo());

        Perro perro = new Perro();
        //nombre y raza no son public pero se pueden usar dentro del mismo package
        perro.nombre = "Tobby";
        perro.raza = "Bulldog";
        System.out.println(perro.jugar(persona));
        
        System.out.println(Persona.saludar());
        System.out.println(saludar()); //se importa el método estático
        System.out.println(GENERO_MASCULINO); //se importa el método estático
    }
}

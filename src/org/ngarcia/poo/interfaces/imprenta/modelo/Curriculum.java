package org.ngarcia.poo.interfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible{

    private Persona persona;
    private String carrera;
    private List<String> experiencias;
        
    public Curriculum(Persona persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }
        
    public Curriculum addExperiencia(String exp) {
        this.experiencias.add(exp);
        return this;
    }
    
    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("\nCurriculum de: ");
        sb.append(persona).append("\nResumen: ").append(this.contenido)
          .append("\nProfesión: ").append(this.carrera)
          .append("\nExperiencias: \n");
        for(String exp: this.experiencias) {
            sb.append("- ").append(exp).append("\n");
        }
        return sb.toString();
    }
    
}

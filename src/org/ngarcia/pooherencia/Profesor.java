package org.ngarcia.pooherencia;

public class Profesor extends Persona {

    private String asignatura;
    
    public Profesor(String nombre, String apellido) {
        super(nombre,apellido);
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}

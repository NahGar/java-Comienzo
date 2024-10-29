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
    
    @Override
    public String saludar() {
        return "Buenos días soy el profesor de " + getAsignatura() +
                ", mi nombre es " + this.getNombre();
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nasignatura=" + asignatura;
    }
    
    
}

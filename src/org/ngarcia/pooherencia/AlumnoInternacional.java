package org.ngarcia.pooherencia;

public class AlumnoInternacional extends Alumno {
    
    private String pais;
    private double notaIdiomas;

    public AlumnoInternacional() {
    }
    
    public AlumnoInternacional(String nombre, String apellido) {
        super(nombre,apellido);
    }
    
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }
}

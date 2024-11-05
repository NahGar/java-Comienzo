package org.ngarcia.poo.herencia;

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
    
    @Override
    public String saludar() {
        return super.saludar() +
                ". Soy extranjero.";
    }

    @Override
    public double calcularPromedio() {
        //System.out.println("org.ngarcia.pooherencia.AlumnoInternacional.calcularPromedio()");
        return ((super.calcularPromedio() * 3) + notaIdiomas)/4;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\npais=" + pais + ", notaIdiomas=" + notaIdiomas;
    }
        
    
    
}

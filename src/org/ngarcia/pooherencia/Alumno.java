package org.ngarcia.pooherencia;

public class Alumno extends Persona {

    private String institucion;
    private double notaMatematica;
    private double notaLenguaje;
    private double notaHistoria;

    //public String getNombre() {
    //    return nombre;
    //}
    //public void setNombre(String nombre) {
    //    this.nombre = nombre;
    //}

    public Alumno() {
    }
    
    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
    }
    
    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }
    
    public Alumno(String nombre, String apellido, int edad, String institucion) {
        //podría usar this en lugar de super
        super(nombre, apellido, edad);
        this.institucion = institucion;
    }
    
    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaLenguaje() {
        return notaLenguaje;
    }

    public void setNotaLenguaje(double notaLenguaje) {
        this.notaLenguaje = notaLenguaje;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }
}

package org.ngarcia.app.hogar;

public class Persona {

    private String nombre;
    private String apellido;
    private ColorPeloEnum colorPelo;
    
    public static final String GENERO_MASCULINO = "Masculino";
    public static final String GENERO_FEMENINO = "Femenino";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ColorPeloEnum getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(ColorPeloEnum colorPelo) {
        this.colorPelo = colorPelo;
    }
        

    public String lanzarPelota() {
        return "lanza pelota al perro";
    }
    
    public static String saludar() {
        return "hola que tal";
    }
}

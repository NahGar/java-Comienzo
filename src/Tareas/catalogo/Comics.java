package Tareas.catalogo;

import java.util.Date;

public class Comics extends Libro {
    
    private String personaje;

    public Comics(String personaje, Date fechaPublicacion, String autor, String titulo, String editorial, int precio) {
        super(fechaPublicacion, autor, titulo, editorial, precio);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    @Override
    public double getPrecioVenta() {
        return  getPrecio() * 0.85;
    }

    @Override
    public String toString() {
        return super.toString() + ", personaje=" + personaje;
    }

    
}

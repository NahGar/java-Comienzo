package Tareas.catalogo;

import java.util.Date;

public class Libro extends Producto implements IProducto, ILibro {

    private Date fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(Date fechaPublicacion, String autor, String titulo, String editorial, int precio) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    @Override
    public Date getFechaPublicacion() {
        return this.fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return this.autor;
    }

    @Override
    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public String getEditorial() {
        return this.editorial;
    }
    
    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.95;
    }

    @Override
    public String toString() {
        return super.toString() + ", fecha de publicación=" + fechaPublicacion + 
                ", autor=" + autor + ", título=" + titulo + 
                ", editorial=" + editorial;
    }
    
}

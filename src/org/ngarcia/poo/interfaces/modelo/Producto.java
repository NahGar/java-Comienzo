package org.ngarcia.poo.interfaces.modelo;

public class Producto extends BaseEntity {

    private String descripcion;
    private Double precio;

    public Producto(String descripcion, Double precio) {
        super();
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", descripción='" + descripcion + '\'' +
                ", precio=" + precio;
    }
}

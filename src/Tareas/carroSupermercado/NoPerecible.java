package Tareas.carroSupermercado;

public class NoPerecible extends Producto {

    private Integer contenido;
    private Integer calorias;

    public NoPerecible(String nombre, Double precio, Integer contenido, Integer calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public Integer getContenido() {
        return contenido;
    }

    public Integer getCalorias() {
        return calorias;
    }
}

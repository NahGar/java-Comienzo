package Tareas.carroSupermercado;

public class Lacteo extends Producto {

    private Integer cantidad;
    private Integer proteinas;

    public Lacteo(String descripcion, Double precio, Integer cantidad, Integer proteinas) {
        super(descripcion, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public Integer getProteinas() {
        return proteinas;
    }
}

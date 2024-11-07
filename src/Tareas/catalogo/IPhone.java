package Tareas.catalogo;

public class IPhone extends Electronico implements IProducto {

    private String modelo;
    private String color;

    public IPhone(String modelo, String color, String fabricante, int precio) {
        super(fabricante, precio);
        this.modelo = modelo;
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }
    
    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.9;
    }

    @Override
    public String toString() {
        return super.toString() + ", modelo=" + modelo + ", color=" + color;
    }
}

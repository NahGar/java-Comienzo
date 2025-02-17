package Tareas.catalogo;

abstract public class Producto implements IProducto {
    
    protected int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return this.precio;
    }

    @Override
    public String toString() {
        return "Precio=" + precio;
    }
    
}

package Tareas.catalogo;

public interface IProducto {

    default int getPrecio() {
        return 1;
    }
    
    double getPrecioVenta();
}

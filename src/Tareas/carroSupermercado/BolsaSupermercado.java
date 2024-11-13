package Tareas.carroSupermercado;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BolsaSupermercado<T> implements Iterable<T> {

    private List<T> productos = new ArrayList<>(5);
    private static int MAX = 5;

    public void addProducto(T obj) {
        if(productos.size() <= MAX) {
            this.productos.add(obj);
        }
    }

    public List<T> getProductos() {
        return this.productos;
    }

    @Override
    public Iterator<T> iterator() {
        return this.productos.iterator();
    }
}

package Tareas;

public class Producto {

    private String nombre;
    private String fabricante;
    private int precio;

    public Producto(String nombre, int precio, String fabricante) {
        this.nombre = nombre;
        this.precio = precio;
        this.fabricante = fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getPrecio() {
        return precio;
    }
}

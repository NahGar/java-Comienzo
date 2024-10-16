package Tareas;

import java.util.Date;

public class OrdenCompra {
    private int identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] prductos = new Producto[4];
    private static int ultIdentificador = 0;
    private static int ultIdentificadorProductos = 0;

    public OrdenCompra() {
        this.identificador = ++ultIdentificador;
        this.ultIdentificadorProductos = 0;
    }

    public OrdenCompra(String descripcion) {
        this(); //para que ejecute el constructor sin parametros
        this.descripcion = descripcion;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getPrductos() {
        return prductos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProducto (Producto producto) {
        if(ultIdentificadorProductos <= this.prductos.length) {
            this.prductos[ultIdentificadorProductos++] = producto;
        }
    }

    public int getTotal() {
        int total = 0;
        for(Producto producto: this.prductos) {
            total += producto.getPrecio();
        }
        return total;
    }
}

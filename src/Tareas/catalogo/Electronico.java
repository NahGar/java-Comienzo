package Tareas.catalogo;

abstract public class Electronico extends Producto implements IElectronico {

    protected String fabricante;

    public Electronico(String fabricante, int precio) {
        super(precio);
        this.fabricante = fabricante;
    }
    
    @Override
    public String getFabricante() {
        return this.fabricante;
    }

    @Override
    public String toString() {
        return super.toString() + ", fabricante=" + fabricante;
    }
}

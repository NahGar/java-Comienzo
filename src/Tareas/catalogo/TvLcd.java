package Tareas.catalogo;

public class TvLcd extends Electronico implements IProducto {
    
    private int pulgadas;

    public TvLcd(int pulgadas, String fabricante, int precio) {
        super(fabricante, precio);
        this.pulgadas = pulgadas;
    }
    
    public int getPulgadas() {
        return pulgadas;
    }
    
    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.8;
    }

    @Override
    public String toString() {
        return super.toString() + ", pulgadas=" + pulgadas;
    }
    
    
}

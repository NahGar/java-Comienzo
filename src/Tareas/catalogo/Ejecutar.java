package Tareas.catalogo;

import java.util.Date;

public class Ejecutar {
    
    public static void main(String[] args) {
        
        IProducto[] productos = new Producto[4];

        productos[0] = new TvLcd(32, "Sony", 150);
        productos[1] = new Libro(new Date(), "Tolkien", "LOTR", "Ni idea", 100);
        productos[2] = new Comics("Thor", new Date(), "Marvel", "Thorcito", "Editorial", 50);
        productos[3] = new IPhone("14", "Rojo", "Apple", 1000);
        
        for(IProducto producto: productos ) {
            System.out.println(producto);
        }
        
    }
    
}

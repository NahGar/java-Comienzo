package Tareas.stream;

import java.util.ArrayList;
import java.util.List;

public class EjecutarCalcularImporteDeLista {
    public static void main(String[] args) {
        
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Pinza chica",80.0,2));
        productos.add(new Producto("Pinza mediana",120.0,1));
        productos.add(new Producto("Pinza grande",170.0,3));
        
        double total = productos.stream()
                .map( producto -> producto.getCantidad() * producto.getPrecio() )
                .peek(System.out::println)
                .reduce(0d, (a,b) -> a + b );
        
        System.out.println("total:"+total);
        
        
        /*
        List<Producto> facturas = Arrays.asList(new Producto(9.99, 1), new Producto(19.99, 1.5), new Producto(4.99, 2));
        double sum = facturas.stream()
                .map(p -> p.getCantidad() * p.getPrecio())
                .reduce(0d, Double::sum);
        System.out.println(sum);
        */
        
        /*
        List<Producto> facturas = Arrays.asList(new Producto(9.99, 1), new Producto(19.99, 1.5), new Producto(4.99, 2));

        double sum = facturas.stream()
                .mapToDouble(x -> x.getCantidad() * x.getPrecio()) 
                .sum();

        System.out.println(sum); 
        */
    }
}

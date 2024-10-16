package Tareas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TareaOrdenDeCompra {

    public static void main(String[] args) {

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        OrdenCompra[] ordenes = new OrdenCompra[3];

        OrdenCompra orden = new OrdenCompra("Descripcion orden1");
        try {
            Date fecha = formato.parse("12/10/2024");
            orden.setFecha(fecha);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        orden.setCliente(new Cliente("Juan","Martínez"));
        orden.addProducto(new Producto("Cigarros",15,"Nevada"));
        orden.addProducto(new Producto("Gelatina",10,"Royal"));
        orden.addProducto(new Producto("Talco",45,"J&J"));
        orden.addProducto(new Producto("Teclado",80,"Genius"));
        ordenes[0] = orden;

        orden = new OrdenCompra("Descripcion orden2");
        try {
            Date fecha = formato.parse("12/9/2024");
            orden.setFecha(fecha);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        orden.setCliente(new Cliente("Carlos","Fernández"));
        orden.addProducto(new Producto("Pan",15,"Nevada"));
        orden.addProducto(new Producto("Azúcar",20,"Royal"));
        orden.addProducto(new Producto("Jabón",35,"J&J"));
        orden.addProducto(new Producto("Muzza",70,"Genius"));
        ordenes[1] = orden;

        orden = new OrdenCompra("Descripcion orden3");
        try {
            Date fecha = formato.parse("12/08/2024");
            orden.setFecha(fecha);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        orden.setCliente(new Cliente("Evan","García"));
        orden.addProducto(new Producto("Caramelos",5,"Nevada"));
        orden.addProducto(new Producto("Limones",30,"Royal"));
        orden.addProducto(new Producto("Parlante",15,"J&J"));
        orden.addProducto(new Producto("Mouse",40,"Genius"));
        ordenes[2] = orden;


        for(OrdenCompra ordCom: ordenes) {

            StringBuilder sb = new StringBuilder();
            sb.append("Orden (").append(ordCom.getIdentificador()).append("):").append(ordCom.getDescripcion())
                    .append("\n").append("Fecha:").append(formato.format(ordCom.getFecha()) )
                    .append("\n").append("Cliente:").append(ordCom.getCliente().getNombre()).append(" ")
                    .append(ordCom.getCliente().getApellido());
            System.out.println(sb);
            for(Producto producto: ordCom.getPrductos()) {
                System.out.println("Producto:"+producto.getNombre()+" Fab:"+producto.getFabricante()+
                        " Prec:"+producto.getPrecio());
            }
            System.out.println("Total:"+ordCom.getTotal());
        }


    }
}

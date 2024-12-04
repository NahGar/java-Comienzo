package org.ngarcia.api.stream;

import org.ngarcia.api.stream.models.Factura;
import org.ngarcia.api.stream.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class EjecutarFlatMapFactura {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Juan","Rodriguez");
        Usuario usuario2 = new Usuario("Carlos","Gutierrez");

        usuario1.addFactura(new Factura("Compra tecnología"));
        usuario1.addFactura(new Factura("Compra muebles"));
        usuario2.addFactura(new Factura("Compra bicicleta"));
        usuario2.addFactura(new Factura("Compra notebook"));

        List<Usuario> usuarios = Arrays.asList(usuario1,usuario2);
        /*
        for(Usuario u: usuarios) {
            for(Factura f: u.getFacturas()) {
                System.out.println(f.getDescripcion());
            }
        }*/
        //Como hacer lo anterior con stream y flatMap
        usuarios.stream()
                //.map( u -> u.getFacturas() ) //convierte a List<Factura>
                //.flatMap( lf -> lf.stream() ) //convierte a stream de facturas
                //equivalente
                .flatMap( u -> u.getFacturas().stream() ) //convierte list facturas a un flujo
                .forEach( f -> System.out.println(f.getDescripcion() + " " + f.getUsuario()));
    }
}

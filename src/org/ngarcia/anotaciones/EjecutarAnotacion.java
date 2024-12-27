package org.ngarcia.anotaciones;

import org.ngarcia.anotaciones.models.Producto;
import org.ngarcia.anotaciones.models.procesador.JsonSerializador;

import java.time.LocalDate;

public class EjecutarAnotacion {
    public static void main(String[] args) {

        Producto p = new Producto();
        p.setFecha(LocalDate.now());
        p.setNombre("mesa de roble");
        p.setPrecio(100L);

        System.out.println(JsonSerializador.convertirJson(p));
    }
}

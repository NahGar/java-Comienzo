package org.ngarcia.java8.lambda;

import org.ngarcia.java8.lambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjecutarConsumer {
    public static void main(String[] args) {

        //Consumer crea un método que recibe un único parámetro y devuelve void
        //Consumer<Date> consumidor = fecha -> System.out.println(fecha);
        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };

        consumidor.accept(new Date());

        //BiConsumer acepta 2 parámetros
        BiConsumer<String,Integer> biconsumidor = (nombre,edad) ->
            System.out.println(nombre+" tiene "+edad+" años");

        biconsumidor.accept("Alvaro",88);

        Consumer<String> consumidor2 = System.out::println;

        consumidor2.accept("Probando consumer2");

        //foreach usa consumer
        List<String> nombres = Arrays.asList("juan","mica","roberto","carlos");
        //por cada elemento ejecuta el consumer
        nombres.forEach(consumidor2);

        //Usuario usuario = new Usuario();
        Supplier<Usuario> creaUsuario = () -> new Usuario();
        Usuario usuario = creaUsuario.get();

        //BiConsumer<Usuario,String> asignarNombre = (usuario1,nombre) -> {
        //    usuario1.setNombre(nombre);
        //};
        //más corto
        BiConsumer<Usuario,String> asignarNombre = Usuario::setNombre;

        asignarNombre.accept(usuario,"Carlitos");
        System.out.println("Nombre usuario: "+usuario.getNombre());

        //Supplier no recibe parms y devuelve un valor del tipo indicado
        //Supplier<String> proveedor = () -> {
        //    return "Hola mundo lamda supplier";
        //};
        //como es una sola línea se puede abreviar
        Supplier<String> proveedor = () -> "Hola mundo lamda supplier";


        System.out.println(proveedor.get());

    }
}

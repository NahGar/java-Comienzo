package org.ngarcia.anotaciones.models.procesador;

import org.ngarcia.anotaciones.Init;
import org.ngarcia.anotaciones.JsonAtributo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class JsonSerializador {

    public static void inicializarObjeto(Object object) {
        if(Objects.isNull(object)) {
            throw new JsonSerializadorException("El obj a serializar no puede ser null");
        }
        Method[] metodos = object.getClass().getDeclaredMethods();
        Arrays.stream(metodos).filter( m -> m.isAnnotationPresent(Init.class))
                .forEach( m -> {
                    m.setAccessible(true);
                    try {
                        m.invoke(object);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new JsonSerializadorException(e.getMessage());
                    }
                });
    }

    public static String convertirJson(Object object) {

        if(Objects.isNull(object)) {
            throw new JsonSerializadorException("El obj a serializar no puede ser null");
        }

        inicializarObjeto(object);

        Field[] atributos = object.getClass().getDeclaredFields();
        return Arrays.stream(atributos)
                .filter( a -> a.isAnnotationPresent(JsonAtributo.class))
                .map( a -> {
                    //esto se debe indicar porque los campos son private
                    a.setAccessible(true);
                    String nombre = a.getAnnotation(JsonAtributo.class).nombre().equals("")
                            ? a.getName()
                            : a.getAnnotation(JsonAtributo.class).nombre();
                    try {
                        Object valor = a.get(object);
                        if(a.getAnnotation(JsonAtributo.class).capitalizar() &&
                           valor instanceof String) {
                            String nuevoValor = (String) valor;
                            //aplica a la primer palabra
                            //nuevoValor = String.valueOf(nuevoValor.charAt(0)).toUpperCase() +
                            //        nuevoValor.substring(1).toLowerCase();

                            //aplica a cada palabra
                            nuevoValor = Arrays.stream(nuevoValor.split(" "))
                                            .map( p -> String.valueOf(p.charAt(0)).toUpperCase() +
                                                    p.substring(1).toLowerCase())
                                            .collect(Collectors.joining(" "));

                            a.set(object,nuevoValor);
                        }
                        return "\"" + nombre + "\":\"" + a.get(object) + "\"";
                    } catch (IllegalAccessException e) {
                        throw new JsonSerializadorException(e.getMessage());
                    }
                })
                .reduce("{", (a,b) -> {
                    if("{".equals(a)) { //primer elemento
                        return a + b;
                    }
                    return a + ", " + b;
                })
                .concat("}");
    }
}

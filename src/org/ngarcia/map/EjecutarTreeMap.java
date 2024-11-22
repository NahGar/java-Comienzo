package org.ngarcia.map;

import java.util.*;

public class EjecutarTreeMap {
    public static void main(String[] args) {

        //TreeMap ordena por la llave de forma ascendente
        //Map<String,Object> persona = new TreeMap<>();
        //cambia a orden descendente
        //Map<String,Object> persona = new TreeMap<>( (a,b) -> b.compareTo(a));
        //otra forma:
        //Map<String,Object> persona = new TreeMap<>( Comparator.reverseOrder() );
        //ordenar por el largo del String (reversed)
        Map<String,Object> persona = new TreeMap<>( Comparator.comparing(String::length).reversed() );
        //no puede haber nulos
        //persona.put(null, "1234");
        persona.put("nombre", "Michael");
        persona.put("apellido", "Scott");
        persona.put("teléfono", "555-4528");
        persona.put("email", "mscott@office.com");
        persona.put("edad", 50);

        Map<String,String> direccion = new TreeMap<>();
        direccion.put("pais","Venezuela");
        direccion.put("region","Distrito de Caracas");
        direccion.put("ciudad","Caracas");
        direccion.put("calle","Bolivar");
        direccion.put("numero","445");

        persona.put("direccion", direccion);

        System.out.println(persona);


    }
}

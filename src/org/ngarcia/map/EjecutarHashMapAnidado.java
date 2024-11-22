package org.ngarcia.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjecutarHashMapAnidado {
    public static void main(String[] args) {

        Map<String,Object> persona = new HashMap<>();
        persona.put(null, "1234");
        persona.put("nombre", "Michael");
        persona.put("apellido", "Scott");
        persona.put("teléfono", "555-4528");
        persona.put("email", "mscott@office.com");
        persona.put("edad", 50);

        Map<String,String> direccion = new HashMap<>();
        direccion.put("pais","Venezuela");
        direccion.put("region","Distrito de Caracas");
        direccion.put("ciudad","Caracas");
        direccion.put("calle","Bolivar");
        direccion.put("numero","445");

        persona.put("direccion", direccion);

        System.out.println(persona);
        System.out.println(persona.get("nombre")+" "+persona.get("apellido"));

        //obtiene hashmap
        Map<String,String> direccionGet = (Map<String,String>) persona.get("direccion");
        System.out.println("get direccion:"+direccionGet.get("calle") + " " +
                direccionGet.getOrDefault("nomero", "(no tiene ese valor)"));


        String telefono = (String) persona.remove("teléfono");
        //no elimina porque edad es 50
        boolean elimino = persona.remove("edad",49);
        System.out.println("Elimina tel " + telefono);
        System.out.println(persona);

        System.out.println("Existe tel " + persona.containsKey("teléfono"));
        System.out.println("Existe valor " + persona.containsValue("Scott"));

        System.out.println("---sustituye---");
        //replace tiene sobrecarga que permite pasar el valor actual,
        //si no coincide no reemplaza (devuelve boolean)
        persona.replace("edad",90);

        Collection<Object> valores = persona.values();
        System.out.println("Valores " + valores);

        Set<String> llaves = persona.keySet();
        System.out.println("Llaves " + llaves);

        System.out.println("---obtiene key & value---");
        for(Map.Entry<String,Object> par: persona.entrySet()) {
            //System.out.println(par.getKey()+" -> "+par.getValue());
            Object valor = par.getValue();
            if(valor instanceof Map) {
                Map<String,String> direccionMap = (Map<String,String>) valor;
                for(Map.Entry<String, String> parDir : direccionMap.entrySet()) {
                    System.out.println(parDir.getKey()+" -> " + parDir.getValue());
                }
            }
            else {
                System.out.println(par.getKey()+" -> " + valor);
            }
        }

        System.out.println("---obtiene keys & itera obteniendo valor---");
        for(String llave: persona.keySet()) {
            //System.out.println(llave + " -> " + persona.get(llave));
            Object valor = persona.get(llave);
            if(valor instanceof Map) {
                Map<String,String> direccionMap = (Map<String,String>) valor;
                System.out.println("El pais de " + persona.get("nombre")+ " es " +
                        direccionMap.get("pais"));
            }
            else {
                System.out.println(llave + " -> " + valor);
            }

        }

        System.out.println("---expresion lambda---");
        persona.forEach( (llave, valor) -> System.out.println(llave + "->" + valor) );

        System.out.println("cantidad elementos:"+persona.size());
    }
}

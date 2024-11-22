package org.ngarcia.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjecutarHashMap {
    public static void main(String[] args) {
        
        Map<String,String> persona = new HashMap<>();
        
        persona.put(null, "1234");
        persona.put("nombre", "Michael");
        persona.put("apellido", "Scott");
        persona.put("teléfono", "555-4528");
        persona.put("email", "mscott@office.com");
        persona.put("edad", "50");
        
        System.out.println(persona);
        System.out.println(persona.get("nombre")+" "+persona.get("apellido"));
        
        String telefono = persona.remove("teléfono");
        //no elimina porque edad es "50"
        boolean elimino = persona.remove("edad","49");
        System.out.println("Elimina tel " + telefono);
        System.out.println(persona);

        System.out.println("Existe tel " + persona.containsKey("teléfono"));
        System.out.println("Existe valor " + persona.containsValue("Scott"));

        System.out.println("---sustituye---");
        //replace tiene sobrecarga que permite pasar el valor actual,
        //si no coincide no reemplaza (devuelve boolean)
        persona.replace("edad","90");

        Collection<String> valores = persona.values();
        System.out.println("Valores " + valores);

        Set<String> llaves = persona.keySet();
        System.out.println("Llaves " + llaves);

        System.out.println("---obtiene key & value---");
        for(Map.Entry<String,String> par: persona.entrySet()) {
            System.out.println(par.getKey()+" -> "+par.getValue());
        }

        System.out.println("---obtiene keys & itera obteniendo valor---");
        for(String llave: persona.keySet()) {
            System.out.println(llave + " -> " + persona.get(llave));
        }

        System.out.println("---expresion lambda---");
        persona.forEach( (llave, valor) -> System.out.println(llave + "->" + valor) );

        System.out.println("cantidad elementos:"+persona.size());

    }
}

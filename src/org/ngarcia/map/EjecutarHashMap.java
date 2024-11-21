package org.ngarcia.map;

import java.util.HashMap;
import java.util.Map;

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
    }
}

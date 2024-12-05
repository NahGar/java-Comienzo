package org.ngarcia.optional;

import java.util.Optional;

/**
 *
 * @author nahuel
 */
public class Ejecutar {
    public static void main(String[] args) {
        
        String nombre = "Pepe";
        Optional<String> opt = Optional.of(nombre);
        System.out.println(opt);
        System.out.println(opt.isPresent());
        if(opt.isPresent()) {
            System.out.println("Hola " + opt.get());
        }
        opt.ifPresent( valor -> System.out.println("Hola " + valor + " (funcional)") );
        
        
        nombre = null;
        //si el valor es null no se puede utilizar of porque retorna error
        //se utiliza ofNullable en ese caso
        opt = Optional.ofNullable(nombre);
        System.out.println(opt);
        
        //arg1 si está presente, arg2 si no está presente
        opt.ifPresentOrElse( valor -> System.out.println("Hola " + valor), () -> {
            System.out.println("No está");
        });
    }
}

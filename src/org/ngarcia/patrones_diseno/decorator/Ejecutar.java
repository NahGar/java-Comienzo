package org.ngarcia.patrones_diseno.decorator;

import org.ngarcia.patrones_diseno.decorator.decorador.*;

public class Ejecutar {
    public static void main(String[] args) {

        Formateable texto = new Texto("Hola que tal!");

        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        ReversaDecorador reversa = new ReversaDecorador(mayuscula);
        SubrayadoDecorador subrayar = new SubrayadoDecorador(reversa);
        ReemplazarEspaciosDecorador reemplazar = new ReemplazarEspaciosDecorador(subrayar);
        System.out.println(reemplazar.darFormato());
    }
}

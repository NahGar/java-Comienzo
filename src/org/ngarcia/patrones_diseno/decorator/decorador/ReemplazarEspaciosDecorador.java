package org.ngarcia.patrones_diseno.decorator.decorador;

import org.ngarcia.patrones_diseno.decorator.Formateable;

public class ReemplazarEspaciosDecorador extends TextoDecorador {

    public ReemplazarEspaciosDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ","_");
    }
}

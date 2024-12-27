package org.ngarcia.patrones_diseno.decorator.decorador;

import org.ngarcia.patrones_diseno.decorator.Formateable;

abstract public class TextoDecorador implements Formateable {

    protected Formateable texto;

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }
}

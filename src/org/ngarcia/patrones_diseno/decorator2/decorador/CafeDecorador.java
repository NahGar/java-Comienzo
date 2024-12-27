package org.ngarcia.patrones_diseno.decorator2.decorador;

import org.ngarcia.patrones_diseno.decorator2.Configurable;

abstract public class CafeDecorador implements Configurable {

    protected Configurable cafe;

    public CafeDecorador(Configurable cafe) {
        this.cafe = cafe;
    }
}

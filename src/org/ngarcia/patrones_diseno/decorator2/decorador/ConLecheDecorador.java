package org.ngarcia.patrones_diseno.decorator2.decorador;

import org.ngarcia.patrones_diseno.decorator2.Configurable;

public class ConLecheDecorador extends CafeDecorador {

    public ConLecheDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase() + 3f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", Leche";
    }
}

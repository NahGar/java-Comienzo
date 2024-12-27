package org.ngarcia.patrones_diseno.factory;

import org.ngarcia.patrones_diseno.factory.producto.*;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory {
    @Override
    PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {
            case "vegetariana" -> new PizzaCaliforniaVegetariana();
            case "pepperoni" -> new PizzaCaliforniaPepperoni();
            case "queso" -> new PizzaCaliforniaQueso();
            default -> null;
        };
    }
}

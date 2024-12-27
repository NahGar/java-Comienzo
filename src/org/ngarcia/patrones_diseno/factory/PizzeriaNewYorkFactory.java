package org.ngarcia.patrones_diseno.factory;

import org.ngarcia.patrones_diseno.factory.producto.PizzaNewYorkItaliana;
import org.ngarcia.patrones_diseno.factory.producto.PizzaNewYorkPepperoni;
import org.ngarcia.patrones_diseno.factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory {
    @Override
    PizzaProducto crearPizza(String tipo) {

        return switch (tipo) {
            case "vegetariana" -> new PizzaNewYorkVegetariana();
            case "pepperoni" -> new PizzaNewYorkPepperoni();
            case "italiana" -> new PizzaNewYorkItaliana();
            default -> null;
        };
    }
}

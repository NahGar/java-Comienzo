package org.ngarcia.patrones_diseno.factory.producto;

import org.ngarcia.patrones_diseno.factory.PizzaProducto;

public class PizzaNewYorkPepperoni extends PizzaProducto {

    public PizzaNewYorkPepperoni() {
        super(); //para inicializar el arraylist de ingredientes
        nombre = "Pizza pepperoni New York";
        masa = "Masa delgada a la piedra";
        salsa = "Salsa de tomate";
        ingredientes.add("queso mozzarella");
        ingredientes.add("pepperoni");
        ingredientes.add("aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 40min a 90 grados");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triángulos");
    }
}

package org.ngarcia.patrones_diseno.factory.producto;

import org.ngarcia.patrones_diseno.factory.PizzaProducto;

public class PizzaCaliforniaPepperoni extends PizzaProducto {

    public PizzaCaliforniaPepperoni() {
        super(); //para inicializar el arraylist de ingredientes
        nombre = "Pizza California Pepperoni";
        masa = "Masa delgada a la piedra";
        salsa = "Salsa tomate";
        ingredientes.add("pepperoni");
        ingredientes.add("mozzarella");
        ingredientes.add("aceituna");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 50min a 75 grados");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños rectángulos");
    }
}

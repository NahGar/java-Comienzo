package org.ngarcia.patrones_diseno.factory.producto;

import org.ngarcia.patrones_diseno.factory.PizzaProducto;

public class PizzaCaliforniaVegetariana extends PizzaProducto {

    public PizzaCaliforniaVegetariana() {
        super(); //para inicializar el arraylist de ingredientes
        nombre = "Pizza vegetariana California";
        masa = "Masa delgada light";
        salsa = "Salsa BBQ light";
        ingredientes.add("queso mozzarella");
        ingredientes.add("aceitunas");
        ingredientes.add("espinacas");
        ingredientes.add("cebolla");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 20min a 180 grados");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas rectangulares");
    }
}

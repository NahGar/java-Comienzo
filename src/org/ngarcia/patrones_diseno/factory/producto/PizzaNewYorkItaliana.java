package org.ngarcia.patrones_diseno.factory.producto;

import org.ngarcia.patrones_diseno.factory.PizzaProducto;

public class PizzaNewYorkItaliana extends PizzaProducto {

    public PizzaNewYorkItaliana() {
        super(); //para inicializar el arraylist de ingredientes
        nombre = "Pizza italiana New York";
        masa = "Masa gruesa a la piedra";
        salsa = "Salsa de tomate con carne";
        ingredientes.add("queso mozzarella");
        ingredientes.add("aceitunas");
        ingredientes.add("jamón");
        ingredientes.add("chorizo");
        ingredientes.add("champiñones");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 30min a 120 grados");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triángulos grandes");
    }
}

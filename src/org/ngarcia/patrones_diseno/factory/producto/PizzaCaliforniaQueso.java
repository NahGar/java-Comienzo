package org.ngarcia.patrones_diseno.factory.producto;

import org.ngarcia.patrones_diseno.factory.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto {

    public PizzaCaliforniaQueso() {
        super(); //para inicializar el arraylist de ingredientes
        nombre = "Pizza California Queso";
        masa = "Masa delgada a la piedra";
        salsa = "Salsa tomate";
        ingredientes.add("extra queso mozzarella");
        ingredientes.add("queso azul");
        ingredientes.add("cebolla");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 35min a 100 grados");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños triángulos");
    }
}

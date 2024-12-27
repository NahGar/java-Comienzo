package org.ngarcia.patrones_diseno.factory.producto;

import org.ngarcia.patrones_diseno.factory.PizzaProducto;

public class PizzaNewYorkVegetariana extends PizzaProducto {

    public PizzaNewYorkVegetariana() {
        super(); //para inicializar el arraylist de ingredientes
        nombre = "Pizza vegetariana New York";
        masa = "Masa integral";
        salsa = "Salsa de tomate";
        ingredientes.add("queso vegano");
        ingredientes.add("tomate");
        ingredientes.add("aceitunas");
        ingredientes.add("espinacas");
        ingredientes.add("berenjenas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25min a 150 grados");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas cuadradas");
    }
}

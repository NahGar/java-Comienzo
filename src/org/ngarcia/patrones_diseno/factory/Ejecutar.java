package org.ngarcia.patrones_diseno.factory;

public class Ejecutar {
    public static void main(String[] args) {

        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = california.ordenarPizza("queso");
        System.out.println("Bruce ordena la pizza: " + pizza.getNombre());

        pizza = ny.ordenarPizza("pepperoni");
        System.out.println("Mica ordena la pizza: " + pizza.getNombre());

        pizza = california.ordenarPizza("vegetariana");
        System.out.println("Evan ordena la pizza: " + pizza.getNombre());

        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("Gael ordena la pizza: " + pizza.getNombre());

        System.out.println(pizza);

    }
}

package org.ngarcia.patrones_diseno.decorator2;

import org.ngarcia.patrones_diseno.decorator2.decorador.ConChocolateDecorador;
import org.ngarcia.patrones_diseno.decorator2.decorador.ConCremaDecorador;
import org.ngarcia.patrones_diseno.decorator2.decorador.ConLecheDecorador;

public class Ejecutar {
    public static void main(String[] args) {

        Configurable cafe = new Cafe("Café Mocha",7f);
        ConCremaDecorador conCrema = new ConCremaDecorador(cafe);
        ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);
        ConChocolateDecorador conChoco = new ConChocolateDecorador(conLeche);
        System.out.println("El precio es " + conChoco.getPrecioBase());
        System.out.println("Ingredientes " + conChoco.getIngredientes());

        Configurable capuchino = new Cafe("Capuchino",4f);
        conCrema = new ConCremaDecorador(capuchino);
        conLeche = new ConLecheDecorador(conCrema);
        System.out.println("El precio es " + conLeche.getPrecioBase());
        System.out.println("Ingredientes " + conLeche.getIngredientes());

        Configurable espresso = new Cafe("Espresso",3f);
        System.out.println("El precio es " + espresso.getPrecioBase());
        System.out.println("Ingredientes " + espresso.getIngredientes());
    }
}

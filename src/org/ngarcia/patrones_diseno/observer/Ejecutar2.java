package org.ngarcia.patrones_diseno.observer;

public class Ejecutar2 {
    public static void main(String[] args) {

        UsuarioRepositorio repo = new UsuarioRepositorio();
        repo.addObserver( (o,u) -> System.out.println("Enviando email a usuario " + u ));
        repo.addObserver( (o,u) -> System.out.println("Enviando email a admin"));
        repo.crearUsuario(new Usuario("Pepe","Mujica"));

    }
}

package org.ngarcia.patrones_diseno.observer;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio extends Observable {
    private List<Usuario> repositorio = new ArrayList<>();

    public void crearUsuario(Usuario usuario) {
        this.repositorio.add(usuario);
        notifyObservers(usuario);
    }
}

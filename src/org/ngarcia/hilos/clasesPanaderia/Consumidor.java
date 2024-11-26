package org.ngarcia.hilos.clasesPanaderia;

import java.util.concurrent.ThreadLocalRandom;

public class Consumidor implements Runnable {
    
    private Panaderia panaderia;

    public Consumidor(Panaderia panaderia) {
        this.panaderia = panaderia;
    }
    
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            String pan = panaderia.consumir();
        }
    }
}

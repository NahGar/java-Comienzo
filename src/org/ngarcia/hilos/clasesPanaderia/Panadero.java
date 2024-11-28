package org.ngarcia.hilos.clasesPanaderia;

import java.util.concurrent.ThreadLocalRandom;

public class Panadero implements Runnable {

    private Panaderia panaderia;

    public Panadero(Panaderia panaderia) {
        this.panaderia = panaderia;
    }
    
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            panaderia.hornear("Pan nº " + i);
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(500,2000));
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
        
}

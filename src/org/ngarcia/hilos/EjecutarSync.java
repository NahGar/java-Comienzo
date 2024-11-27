package org.ngarcia.hilos;

import org.ngarcia.hilos.clasesPanaderia.*;

import java.util.concurrent.ThreadLocalRandom;

public class EjecutarSync {
    
    public static void main(String[] args) {
        
        Panaderia panaderia = new Panaderia();
        //new Thread(new Panadero(panaderia)).start();
        //new Thread(new Consumidor(panaderia)).start();

        //java8 con expresiones lambda
        new Thread( () -> {
            for(int i = 1; i <= 10; i++) {
                panaderia.hornear("Pan nº " + i);
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500,2000));
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }).start();

        new Thread( () -> {
            for(int i = 1; i <= 10; i++) {
                String pan = panaderia.consumir();
            }
        }).start();

    }
    
}

package org.ngarcia.hilos.executor;

import java.util.concurrent.*;

public class EjecutarScheduledExecutorService {
    
    public static void main(String[] args) {
        
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
        System.out.println("Alguna tarea en el main ...");
        
        //schedule es async
        executor.schedule( () -> {
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println("Hola mundo tarea ...");
        },2000, TimeUnit.MILLISECONDS);
        
        System.out.println("Alguna otra tarea en el main ...");
        executor.shutdown();
    }
}

package org.ngarcia.hilos.executor;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class EjecutarScheduledExecutorServicePeriodo {
    
    public static void main(String[] args) throws InterruptedException {
        
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
        System.out.println("Alguna tarea en el main ...");
        
        AtomicInteger contador = new AtomicInteger(5);
        //se utiliza para hacer una cuenta regresiva
        //CountDownLatch lock = new CountDownLatch(5);

        //scheduleAtFixedRate es async, en el ej tiene un retraso de 1s 
        //y se ejecuta cada 2s
        Future<?> future = executor.scheduleAtFixedRate(() -> {
            System.out.println("Hola mundo tarea ...");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                contador.getAndDecrement();
                //lock.countDown();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }, 1, 2, TimeUnit.SECONDS);
        
        //espera porque si no shutdown termina la tarea
        //TimeUnit.SECONDS.sleep(10);
        //lock.await(); //espera que llegue a cero la cuenta regresiva
        //future.cancel(true);
        
        int contadorAux = contador.get();
        while(contadorAux > 0) {
            contadorAux = contador.get();
            if(contadorAux == 0) {
                future.cancel(true);
            }
        }
        
        System.out.println("Alguna otra tarea en el main ...");
        executor.shutdown();
    }
}

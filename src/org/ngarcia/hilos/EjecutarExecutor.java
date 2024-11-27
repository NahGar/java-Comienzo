package org.ngarcia.hilos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class EjecutarExecutor {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable tarea = () -> {
            System.out.println("Inicio de tarea ...");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finaliza tarea");
        };

        executor.submit(tarea);
        //si no se hace shutdown la tarea no finaliza. Shutdown espera que la tarea finalize para terminarla.
        executor.shutdown();
        System.out.println("Continúa main 1");
        //espera que finalicen las tareas por un tiempo, en este caso 2 segundos, si pasan los 2s sigue
        executor.awaitTermination(2,TimeUnit.SECONDS);
        System.out.println("Continúa main 2");
    }
}

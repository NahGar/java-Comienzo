package org.ngarcia.hilos.executor;

import java.util.concurrent.*;

public class EjecutarExecutorFuture {

    public static void main(String[] args) throws InterruptedException, 
            ExecutionException,
            TimeoutException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        /*Runnable tarea = () -> {
            System.out.println("Inicio de tarea ...");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finaliza tarea");
        };*/
        //Callable regresa un objeto a diferencia de Runnable
        Callable<String> tarea = () -> {
            System.out.println("Inicio de tarea ...");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finaliza tarea");
            return "Algún resultado de la tarea";
        };

        //Runnable retorna null
        //Future<?> resultado = executor.submit(tarea);
        //Callable retorna un objeto, en este caso String
        Future<String> resultado = executor.submit(tarea);
        //si no se hace shutdown la tarea no finaliza. Shutdown espera que la tarea finalize para terminarla.
        executor.shutdown();
        System.out.println("Continúa main 1");
        
        System.out.println("IsDone:"+resultado.isDone());
        while(!resultado.isDone()) {
            System.out.println("Ejecutando tarea");
            TimeUnit.SECONDS.sleep(1);
        }
        //get queda en espera a que se termine la tarea o puede tener una espera
        System.out.println(resultado.get());
        //System.out.println("Get resultado tarea: " + resultado.get(4, TimeUnit.SECONDS));
        System.out.println("IsDone:"+resultado.isDone());
        
        
    }
}

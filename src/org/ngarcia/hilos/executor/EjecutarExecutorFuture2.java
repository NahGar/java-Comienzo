package org.ngarcia.hilos.executor;

import java.util.concurrent.*;

public class EjecutarExecutorFuture2 {

    public static void main(String[] args) throws InterruptedException, 
            ExecutionException,
            TimeoutException {

        //ExecutorService executor = Executors.newSingleThreadExecutor();
        //se ejecutan en simultáneo hasta 3 hilos
        //ExecutorService executor = Executors.newFixedThreadPool(3);
        //ExecutorService executor = Executors.newFixedThreadPool(2);
        //usa clase ThreadPoolExecutor para acceder a otros métodos
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        
        System.out.println("Tamaño del pool " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola " + executor.getQueue().size());
                        
        //Callable regresa un objeto a diferencia de Runnable
        Callable<String> tarea = () -> {
            System.out.println("Inicio de tarea ... " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finaliza tarea " + Thread.currentThread().getName());
            return "Algún resultado de la tarea";
        };

        Callable<Integer> tarea2 = () -> {
            System.out.println("Inicio de tarea 2 ... " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Fin tarea 2 ... " + Thread.currentThread().getName());
            return 10;
        };
        
        //Runnable retorna null
        //Future<?> resultado = executor.submit(tarea);
        //Callable retorna un objeto, en este caso String
        //Se ejecutan varias tares, una a la vez porque utiliza newSingleThreadExecutor
        Future<String> resultado = executor.submit(tarea);
        Future<String> resultado2 = executor.submit(tarea);
        Future<Integer> resultado3 = executor.submit(tarea2);
        
        System.out.println("Tamaño del pool " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola " + executor.getQueue().size());        
        
        //si no se hace shutdown la tarea no finaliza. Shutdown espera que la tarea finalize para terminarla.
        executor.shutdown();
        System.out.println("Continúa main");
        
        while(!(resultado.isDone() && resultado2.isDone() && resultado3.isDone())) {
            System.out.println(String.format("res1: %s - res2: %s - res3 %s",
                    resultado.isDone() ? "finalizó" : "en proceso",
                    resultado2.isDone() ? "finalizó" : "en proceso",
                    resultado3.isDone() ? "finalizó":"en proceso"));
            TimeUnit.SECONDS.sleep(1);
        }
        //get queda en espera a que se termine la tarea o puede tener una espera
        System.out.println("res1: " + resultado.get());
        System.out.println("res2: " + resultado2.get());
        System.out.println("res3: " + resultado3.get());
        //System.out.println("Get resultado tarea: " + resultado.get(4, TimeUnit.SECONDS));
        System.out.println("IsDone:"+resultado.isDone());
        
        
    }
}

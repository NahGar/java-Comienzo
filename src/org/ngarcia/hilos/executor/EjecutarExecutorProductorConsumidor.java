package org.ngarcia.hilos.executor;

import java.util.concurrent.*;
import org.ngarcia.hilos.clasesPanaderia.*;

public class EjecutarExecutorProductorConsumidor {

    public static void main(String[] args) throws InterruptedException, 
            ExecutionException,
            TimeoutException {

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        
        System.out.println("Tamaño del pool " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola " + executor.getQueue().size());
                
        Panaderia panaderia = new Panaderia();
        Runnable panadero = new Panadero(panaderia);
        Runnable consumidor = new Consumidor(panaderia);
        //Runnable retorna null
        Future<?> futuro1 = executor.submit(panadero);
        Future<?> futuro2 = executor.submit(consumidor);
        
        System.out.println("Tamaño del pool " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola " + executor.getQueue().size());        
        
        //si no se hace shutdown la tarea no finaliza. Shutdown espera que la tarea finalize para terminarla.
        executor.shutdown();
        System.out.println("Continúa main");
        
    }
}

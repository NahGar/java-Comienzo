package org.ngarcia.hilos;

import org.ngarcia.hilos.threads.NombreThread;

public class EjecutarExtenderThread {
    
    public static void main(String[] args) throws InterruptedException {
        
        Thread hilo = new NombreThread("John Doe");
        System.out.println(hilo.getState());
        
        hilo.start();
        //System.out.println(hilo.getState());
        
        //hace pausa de 100ms en main, esperando que termine hilo
        //Thread.sleep(100); 
        
        //System.out.println(hilo.getState());
        
        Thread hilo2 = new NombreThread("María");
        hilo2.start();
        
        Thread hilo3 = new NombreThread("Pepe");
        hilo3.start();
        
        System.out.println(hilo.getState());
    }
}

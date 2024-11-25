package org.ngarcia.hilos;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.ngarcia.hilos.runnable.ViajeTarea;

public class EjecutarInterfaceRunnable {
    public static void main(String[] args) {
        
        //new Thread(new ViajeTarea("Isla de Pascua")).start();
        //new Thread(new ViajeTarea("Robinson Crusoe")).start();
        //new Thread(new ViajeTarea("Juan Fernández")).start();
        //new Thread(new ViajeTarea("Isla de Chiloe")).start();
      
        //usando función anónima
        /*Runnable viaje = new Runnable(){
            @Override
            public void run() {
                for(int i=0; i<10; i++){
                    System.out.println(i+" - "+ Thread.currentThread().getName());
                    try {
                        Thread.sleep((long) (Math.random() * 1000) );
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                System.out.println("Finalmente me voy de viaje a " + Thread.currentThread().getName());
            }
        };*/
        Runnable viaje = () -> {
            
            for(int i=0; i<10; i++){
                System.out.println(i+" - "+ Thread.currentThread().getName());
                try {
                    Thread.sleep((long) (Math.random() * 1000) );
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            System.out.println("Finalmente me voy de viaje a " + Thread.currentThread().getName());
        };
        
        new Thread(viaje,"Isla de Pascua").start();
        new Thread(viaje,"Robinson Crusoe").start();
        new Thread(viaje,"Juan Fernández").start();
        new Thread(viaje,"Isla de Chiloe").start();
    }
}

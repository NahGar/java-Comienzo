package org.ngarcia.hilos;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.ngarcia.hilos.runnable.ViajeTarea;

public class EjecutarInterfaceRunnable {
    public static void main(String[] args) throws InterruptedException {
        
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
        
        Thread main = Thread.currentThread();
        
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
            System.out.println("Estado main:"+main.getState());
        };
        
        Thread th1 = new Thread(viaje,"Isla de Pascua");
        th1.start();
        Thread th2 = new Thread(viaje,"Robinson Crusoe");
        th2.start();
        Thread th3 = new Thread(viaje,"Juan Fernández");
        th3.start();
        Thread th4 = new Thread(viaje,"Isla de Chiloe");
        th4.start();
        
        th1.join(); //espera a que finalice th1 para continuar
        th2.join(); //espera a que finalice th2 para continuar
        th3.join(); //espera a que finalice th3 para continuar
        th4.join(); //espera a que finalice th4 para continuar
                
        System.out.println("Continúa ejecución");
    }
}

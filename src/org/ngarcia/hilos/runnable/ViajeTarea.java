package org.ngarcia.hilos.runnable;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ViajeTarea implements Runnable {

    private String nombre;

    public ViajeTarea(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println(i+" - "+ this.nombre);
            try {
                Thread.sleep((long) (Math.random() * 1000) );
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Finalmente me voy de viaje a " + this.nombre);
        
    }
}

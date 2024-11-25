package org.ngarcia.hilos.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NombreThread extends Thread {

    public NombreThread(String name) {
        super(name);
    }
    
    @Override
    public void run() { //comienza hilo
      
        System.out.println("Se inicia el método run del hilo " + getName());
        
        for(int i=0; i<10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(NombreThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            int porcentaje = (i + 1) * 10;
            System.out.println("Porcentaje " + porcentaje + "% (" + getName() + ")");
        }
        
        System.out.println("Finaliza el hilo " + getName());
    } //finaliza hilo
    
}

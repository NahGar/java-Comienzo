package org.ngarcia.hilos.clasesPanaderia;

public class Panaderia {
    private String pan;
    private boolean disponible;
    
    //synchronized habilita wait() y notity()
    public synchronized void hornear(String masa) {
        
        while(this.disponible) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        this.pan = masa;
        System.out.println("Panadero hornea " + this.pan);
        this.disponible = true;
        notify();
    }
    
    //synchronized habilita wait() y notity()
    public synchronized String consumir() {
        while(!this.disponible) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Cliente consume " + this.pan);
        this.disponible = false;
        notify();
        return this.pan;
    }
}

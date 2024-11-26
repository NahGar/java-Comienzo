package org.ngarcia.hilos;

import org.ngarcia.hilos.clasesPanaderia.*;

public class EjecutarSync {
    
    public static void main(String[] args) {
        
        Panaderia panaderia = new Panaderia();
        new Thread(new Panadero(panaderia)).start();
        new Thread(new Consumidor(panaderia)).start();
    }
    
}

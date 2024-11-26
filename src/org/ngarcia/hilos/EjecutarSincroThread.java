package org.ngarcia.hilos;

import org.ngarcia.hilos.runnable.ImprimirFrases;

public class EjecutarSincroThread {
    
    public static void main(String[] args) throws InterruptedException {
        
        new Thread(new ImprimirFrases("Hola ","que tal?")).start();
        new Thread(new ImprimirFrases("Quién eres ","tú?")).start();
        Thread.sleep(100);
        Thread th3 = new Thread(new ImprimirFrases("Muchas ","gracias amigo!"));
        th3.start();
        Thread.sleep(100);
        System.out.println(th3.getState());
    }
    
    //public static void imprimirFrases(String frase1, String frase2) {
    //el modificador synchronized hace que los hilos se ejecuten uno a la vez
    //y pueden ejecutarse en cualquier orden
    public synchronized static void imprimirFrases(String frase1, String frase2) {
        System.out.print(frase1);
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
        System.out.println(frase2);
    }
    
}

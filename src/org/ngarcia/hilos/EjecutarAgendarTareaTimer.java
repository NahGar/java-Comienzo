package org.ngarcia.hilos;

import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class EjecutarAgendarTareaTimer {

    public static void main(String[] args) {

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        AtomicInteger contAtomic = new AtomicInteger(5);

        //se ejecuta una única vez
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Tarea realizada (única vez): " + new Date() +
                        " thread: " + Thread.currentThread().getName());
                timer.cancel();
            }
        },5000);

        System.out.println("Agendamos tarea para dentro de 5 segundos");

        //se ejecuta cada 2 segundos (la primera a los 5 segundos)
        Timer timer2 = new Timer();
        timer2.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Tarea realizada : " + new Date() +
                        " thread: " + Thread.currentThread().getName());

                toolkit.beep();

                int i = contAtomic.decrementAndGet();
                if(i == 0) {
                    timer2.cancel();
                }
            }
        },5000, 2000);

        //System.out.println("Agendamos tarea para dentro de 5 segundos");
    }
}

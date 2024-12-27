package org.ngarcia.java8.datetime;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class EjecutarDuration2 {
    public static void main(String[] args) {

        Instant i1 = Instant.now();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Instant i2 = Instant.now();
        Duration tiempo = Duration.between(i1,i2);
        System.out.println(tiempo);
    }
}

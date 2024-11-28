package Tareas.hilos;

import java.util.concurrent.*;

public class Ejecutar {
    public static void main(String[] args) {
        
        AlfanumericoTarea alfa = new AlfanumericoTarea(EnumTipo.LETRA);
        AlfanumericoTarea numero = new AlfanumericoTarea(EnumTipo.NUMERO);
        
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(alfa);
        executor.submit(numero);
        executor.shutdown();
    }
}

package Tareas.lambda.contarPalabras;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Ejecutar {
    public static void main(String[] args) {

        IContarPalabras lamdba = frase -> {
            
            String palabraMasRepetida = "";
            int palabraMasRepetidaCantidad = 0;
            String[] palabras = frase.split("[\\s.,!?¿¡]+");
            int[] repeticiones = new int[palabras.length];
            
            for(String palabra: palabras) {
                int contador = 0;
                //cuenta cuantas veces está la palabra
                for(String palabraContar: palabras) {
                    if(palabra.equals(palabraContar)) contador++;
                }
                if(contador > palabraMasRepetidaCantidad) {
                    palabraMasRepetida = palabra;
                    palabraMasRepetidaCantidad = contador;
                }
            }
            //return palabraMasRepetida;
            //Map<String, Integer> resultado = new HashMap();
            //resultado.put(palabraMasRepetida, palabraMasRepetidaCantidad);
            //return resultado;
            return Collections.singletonMap(palabraMasRepetida, palabraMasRepetidaCantidad);
        };
        
        ContarPalabras contarPalabras = new ContarPalabras();
        String frase = "algo sueño perro mata, come come come, rojo, piojo. doce algo, doce. doce";
        Map<String,Integer> resultado = contarPalabras.palabraQueSeRepiteMasVeces(frase, lamdba);
        System.out.println("palabra más repetida:"+resultado);
    }
}

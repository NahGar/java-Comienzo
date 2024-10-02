package Tareas;

import java.util.Scanner;


public class TareaOrdenarArregloUltimoPrimero {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int[] numeros = new int[10];
        int[] numerosOrdenados = new int[numeros.length];
        
        System.out.println("Ingrese 10 números");
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = s.nextInt();
        }
        
        int id = 0;
        for(int i = 0; i < numeros.length /2 ; i++) {
            numerosOrdenados[id++] = numeros[i];
            numerosOrdenados[id++] = numeros[numeros.length-1-i];
        }
        
        System.out.println("Números ordenados");
        for(int numero: numerosOrdenados) {
            System.out.print(numero+" ");
        }
    }
}

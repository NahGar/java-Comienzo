package Arreglos;

import java.util.Scanner;


public class ArreglosBuscarNumero {
    
    public static void main(String[] args) {
    
        int[] a = {1,2,3,4,8,12,14};
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese número a buscar");
        int numero = s.nextInt();
        
        int i = 0;
        while( i < a.length && a[i] != numero) {
            i++;
        }
        
        if(i == a.length) {
            System.out.println("No se encontró el número");
        }
        else {
            System.out.println("El número está en la posición " + i);
        }
    }
}

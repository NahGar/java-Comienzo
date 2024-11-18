package org.ngarcia.arreglos;

import java.util.Scanner;


public class ArreglosParesImpares {
    
    public static void main(String[] args) {
        
        int[] a, pares, impares;
        int totalPares = 0, totalImpares = 0;
        a = new int[10];
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese 10 números: ");
        for(int i=0; i < a.length; i++) {
            a[i] = s.nextInt();
            if(a[i] % 2 == 0) {
                totalPares += 1;
            }
            else {
                totalImpares += 1;
            }
        }
        
        pares = new int[totalPares];
        impares = new int[totalImpares];
        
        int j = 0, k = 0;
        for(int i=0; i < a.length; i++) {
            if(a[i] % 2 == 0) {
                pares[j++] = a[i];
            }
            else {
                impares[k++] = a[i];
            }
        }
        
        System.out.println("Pares: ");
        for( int num: pares ) {
            System.out.print(num + " ");
        }
        System.out.println("\nImpares: ");
        for( int num: impares ) {
            System.out.print(num + " ");
        }
        
    }
}

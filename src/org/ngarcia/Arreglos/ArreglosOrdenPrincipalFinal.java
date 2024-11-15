package org.ngarcia.Arreglos;

public class ArreglosOrdenPrincipalFinal {

    public static void main(String[] args) {

        int[] numeros = new int[10];
        int[] a = new int[10];
        int[] b = new int[20];
        
        for( int i = 0; i < numeros.length; i++ ) {
            numeros[i] = i + 1;
        }
        
        //for( int i = 0; i < numeros.length / 2; i++ ) {
        for( int i = 0; i < numeros.length - i; i++ ) {
            System.out.print("Valores: " + numeros[i] + " ");
            System.out.println(numeros[numeros.length -1 - i]);
            a[i*2] = numeros[i];
            a[i*2+1] = numeros[numeros.length -1 - i];
        }
        
        for( int i = 0; i < a.length; i++ ) {
            System.out.println("A: " + a[i] + " ");
        }
        
    }
}

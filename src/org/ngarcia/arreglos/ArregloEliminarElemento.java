package org.ngarcia.arreglos;

public class ArregloEliminarElemento {
    
    public static void main(String[] args) {
        
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        
        int numeroEliminar = 6;
        
        for(int i = 0; i < numeros.length -1; i++) {
            if( numeros[i] >= numeroEliminar ) {
                numeros[i] = numeros[i+1];
            }
        }
        
        int[] numerosNew = new int[numeros.length -1];
        System.arraycopy(numeros, 0, numerosNew, 0, numerosNew.length);
        
        for(int numero: numerosNew) {
            System.out.print(numero + " ");
        }
    }
}

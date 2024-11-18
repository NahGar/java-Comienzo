package org.ngarcia.arreglos;

public class ArregloAgregarElemento {

    public static void main(String[] args) {
        
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        
        int numeroAgregar = 100;
        int posicionAgregar = 5;
        
        int[] numerosNew = new int[numeros.length +1];
        
        for(int i = 0; i < numerosNew.length; i++) {
            
            if( posicionAgregar > i) {
                numerosNew[i] = numeros[i];
            }
            else if( posicionAgregar == i) {
                numerosNew[i] = numeroAgregar;
            }
            else if( posicionAgregar < i) {
                numerosNew[i] = numeros[i-1];
            }
        }
        
        for(int numero: numerosNew) {
            System.out.print(numero + " ");
        }
    }
}

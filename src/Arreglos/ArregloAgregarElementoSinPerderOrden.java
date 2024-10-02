package Arreglos;

public class ArregloAgregarElementoSinPerderOrden {

    public static void main(String[] args) {
        
        int[] numeros = {15,17,19,23,25,27,0};
        
        int numeroAdd = 21;
        int indiceAdd = 0;
        
        //ubica en el array
        /*
        for(int i = 0; i < numeros.length; i++) {
            if( numeroAdd < numeros[i] && i != 0) {
                indiceAdd = i;
                break;
            }
        }
        */
        while(indiceAdd < numeros.length && numeroAdd > numeros[indiceAdd]) {
            indiceAdd++;
        }
        
        /*
        for(int i = numeros.length - 1; i >= 0; i--) {
            if( i > indiceAdd ) {
                numeros[i] = numeros[i-1];
            }
            else if(i == indiceAdd) {
                numeros[i] = numeroAdd;
                break;
            }
        }
        */
        for(int i = numeros.length - 2; i >= indiceAdd; i--) {
            numeros[i+1] = numeros[i];
        }
        numeros[indiceAdd] = numeroAdd;
                
        for(int numero: numeros) {
            System.out.print(numero + " ");
        }
    }
    
}

package Tareas;

public class TareaImprimirNumeroMasAlto {

    public static void main(String[] args) {
        
        int[] numeros = {14,33,15,36,78,21,43};
        
        int numeroMayor = 0;
        for(int i = 0; i < numeros.length; i++) {
            if(numeroMayor < numeros[i]) {
                numeroMayor = numeros[i];
            }
        }
        
        System.out.println("Número mayor:"+numeroMayor);
    }
}

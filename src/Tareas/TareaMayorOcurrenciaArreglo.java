package Tareas;

public class TareaMayorOcurrenciaArreglo {
    
    public static void main(String[] args) {
        
        int[] numeros = {1, 2, 3, 3, 4, 5, 5, 5, 6, 7};
        int[] ocurrencias = new int[numeros.length];
        int[] numeroOcurrencias = new int[numeros.length];
        
        int numeroMasOcurrencias = 0, masOcurrencias = 0, id = 0;
        
        for(int i=0; i < numeros.length; i++) {
            
            boolean existe = false;
            for(int j=0; j < numeroOcurrencias.length; j++) {
                
                if(numeros[i] == numeroOcurrencias[j]) {
                    existe = true;
                    ocurrencias[j] += 1;
                    
                    if(ocurrencias[j] > masOcurrencias) {
                        masOcurrencias = ocurrencias[j];
                        numeroMasOcurrencias = numeroOcurrencias[j];
                    }
                }
            }
            
            if(!existe) {
                id++;
                numeroOcurrencias[id] = numeros[i];
                ocurrencias[id] = 1;
            }
        }
        
        System.out.println("Número más ocurrencias: " + numeroMasOcurrencias + " (" + masOcurrencias + ")");
    }
}

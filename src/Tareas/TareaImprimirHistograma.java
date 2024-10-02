package Tareas;

public class TareaImprimirHistograma {
    
    public static void main(String[] args) {
        
        int[] numeros = {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1};
        int[] ocurrencias = new int[6];
                
        for(int i=0; i < numeros.length; i++) {
            ocurrencias[numeros[i]-1] += 1; 
        }
        
        for(int i=0; i < ocurrencias.length; i++) {
            int num = i + 1;
            System.out.print("\n" + num + ": ");
            for(int j=1; j <= ocurrencias[i]; j++) {
                System.out.print("*");
            }
        }
        
    }
}

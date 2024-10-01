
import java.util.Scanner;


public class TareaEstadisticaArreglo {

    public static void main(String[] args) {
        
        int[] numeros = new int[7];
        
        Scanner s = new Scanner(System.in);
        
        int cantPos=0, cantNeg=0, cantCero=0;
        
        System.out.println("Ingrese 7 números:");
        for(int i=0; i < numeros.length; i++) {
            
            numeros[i] = s.nextInt();
            
            if(numeros[i] == 0) {
                cantCero += 1;
            }
            else if(numeros[i] > 0) {
                cantPos += 1;
            }
            else if(numeros[i] < 0) {
                cantNeg += 1;
            }
        }
        
        System.out.println("Cantidad ceros: " + cantCero);
        System.out.println("Promedio positivos: " + Math.round((double)cantPos / numeros.length * 100) + "%");
        System.out.println("Promedio negativos: " + Math.round((double)cantNeg / numeros.length * 100) + "%");
        
        
    }
}

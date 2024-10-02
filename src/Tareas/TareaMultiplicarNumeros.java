package Tareas;

import java.util.Locale;
import java.util.Scanner;

public class TareaMultiplicarNumeros {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //para que el separador decimal sea punto 
        
        try {
            
            System.out.println("Ingrese primer número:");

            int numero1 = scanner.nextInt();
            int suma = numero1;
            if( suma < 0 ) {
                suma = -suma;
            }
            
            System.out.println("Ingrese segundo número:");

            int numero2 = scanner.nextInt();
            
            int bucle = numero2;
            if( bucle < 0 ) {
                bucle = -bucle;
            }
            
            int resultado = 0;
            
            for( int i = 1; i <= bucle; i++) {
                resultado += suma;                
            }
            
            if( numero1 < 0 && numero2 > 0 || numero1 > 0 && numero2 < 0) {
                resultado = -resultado;
            }
            
            System.out.println("Resultado: " + resultado);
            
        } 
        catch (Exception e) {
            System.out.println("Error " + e.getMessage());
            
            System.exit(0);
        }
    }
}

import java.util.Locale;
import java.util.Scanner;

public class TareaEncontrarNumeroMenor {
    
    public static void main(String[] args) {
        
        int cantNumeros = 10;
        double numeroMenor = 0;
        
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //para que el separador decimal sea punto 
        
        
        
        try {
            
            for( int i = 0; i <= cantNumeros ; i++ ) {
                
                System.out.println("Ingrese un número:");
                
                double numero = scanner.nextDouble();
                
                if( numero < numeroMenor || numeroMenor == 0 ) {
                    numeroMenor = numero;
                }
            }
            
            System.out.println("Número menor:" + numeroMenor);
            
            if( numeroMenor < 10 ) {
                System.out.println("El número menor es menor que 10!");
            }
            else {
                System.out.println("El número menor es igual o mayor que 10!");
            }
            
        } 
        catch (Exception e) {
            System.out.println("Error " + e.getMessage());
            
            System.exit(0);
        }
            
    }
}

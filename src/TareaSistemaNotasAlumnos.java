
import java.util.Locale;
import java.util.Scanner;

public class TareaSistemaNotasAlumnos {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //para que el separador decimal sea punto 
        
        int notasMas5 = 0;
        int notasMenos4 = 0;
        int notas1 = 0;
        
        try {
            for( int i = 1; i <= 20; i++) {

                System.out.println("Ingrese nota final del alumno:");

                double nota = scanner.nextDouble();
                
                if( !(nota >= 1 && nota <= 7) ) {
                    System.out.println("La nota debe ser de 1 a 7");
                    break;
                }
                
                if( nota == 1) {
                    notas1 += 1;
                }
                else if( nota > 5) {
                    notasMas5 += 1;
                }
                else if( nota < 4) {
                    notasMenos4 += 1;
                }
            }
            
            double promedio = notas1 * 100 / 20;
            System.out.println("Notas con 1: " + notas1 + " " + promedio + "%");
            promedio = notasMenos4 * 100 / 20;
            System.out.println("Notas con menos de 4: " + notasMenos4 + " " + promedio + "%");
            promedio = notasMas5 * 100 / 20;
            System.out.println("Notas con más de 5: " + notasMas5 + " " + promedio + "%");
            
        } 
        catch (Exception e) {
            System.out.println("Error " + e.getMessage());
            
            System.exit(0);
        }
    }
}

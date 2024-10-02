package Tareas;

import java.util.Locale;
import java.util.Scanner;

public class TareaEstanque {
    
    public static void main(String[] args) {
        
        double gasolina;
        String mensaje = "";
        
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //para que el separador decimal sea punto 
        System.out.println("Ingrese los litros de gasolina:");
        
        try {
            gasolina = scanner.nextDouble();
            
            if( gasolina == 70 ) {
                mensaje = "Estanque lleno";
            }
            else if( gasolina >= 60 && gasolina < 70) {
                mensaje = "Estanque casi lleno";
            }
            else if( gasolina >= 40 && gasolina < 60 ) {
                mensaje = "Estanque 3/4";
            }
            else if( gasolina >= 35 && gasolina < 40) {
                mensaje = "Medio estanque";
            }
            else if( gasolina >= 20 && gasolina < 35) {
                mensaje = "Suficiente";
            }
            else if( gasolina >= 1 && gasolina < 20) {
                mensaje = "Insuficiente";
            }
            
            System.out.println(mensaje);           
            
        } 
        catch (Exception e) {
            System.out.println("Error " + e.getMessage()+ ". El separador decimal es punto");
            
            System.exit(0);
        }
    }
}

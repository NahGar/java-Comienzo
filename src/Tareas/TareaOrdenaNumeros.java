package Tareas;

import java.util.Scanner;

public class TareaOrdenaNumeros {
    public static void main(String[] args) {
        
        int numero1;
        int numero2;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        
        try {
            numero1 = scanner.nextInt();
            
            System.out.println("Ingrese un segundo número:");
            
            numero2 = scanner.nextInt();
            
            String mensaje = ( numero1 > numero2 ) ? "El primer número es mayor" 
                    : (numero1 < numero2) ? "El segundo número es mayor" : "Son iguales";
            System.out.println(mensaje);           
            
        } 
        catch (Exception e) {
            System.out.println("Debe ingresar un número entero");
            
            System.exit(0);
        }
    }
}

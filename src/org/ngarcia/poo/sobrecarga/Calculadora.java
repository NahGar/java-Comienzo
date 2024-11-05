package org.ngarcia.poo.sobrecarga;

public class Calculadora {

    //constructor private para evitar que se instancie la clase
    private Calculadora() { }

    public static int sumar(int a, int b) {
        return a + b;
    }

    //si se pasa 2 parametros se usa el de arriba, de lo contrario llama a este
    public static int sumar(int... argumentos) {
        int total = 0;
        for(int a: argumentos) {
            total += a;
        }
        return total;
    }

    public static float sumar(float f, int... argumentos) {
        float total = f;
        for(int a: argumentos) {
            total += a;
        }
        return total;
    }


    public static float sumar(float a, float b) {
        return a + b;
    }
    
    public static double sumar(double a, double b) {
        return a + b;
    }
    
    public static long sumar(long a, long b) {
        return a + b;
    }
    
    public static int sumar(String a, String b) {
        try {
            return Integer.parseInt(a) + Integer.parseInt(b);
        }
        catch(NumberFormatException e) {
            return 0;
        }
    }
}

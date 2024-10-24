package org.ngarcia.poosobrecarga;

public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }
    
    public float sumar(float a, float b) {
        return a + b;
    }
    
    public double sumar(double a, double b) {
        return a + b;
    }
    
    public long sumar(long a, long b) {
        return a + b;
    }
    
    public int sumar(String a, String b) {
        try {
            return Integer.parseInt(a) + Integer.parseInt(b);
        }
        catch(NumberFormatException e) {
            return 0;
        }
    }
}

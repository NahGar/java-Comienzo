package org.ngarcia.poo.excepciones;

public class Calculadora {
    
    public static double dividir(int dividendo, int divisor) throws 
            DivisionPorCeroException {
        
        if(divisor == 0) {
            throw new DivisionPorCeroException("no se puede dividir por cero");
        }
        
        return dividendo / (double) divisor;
    }
    
    public static double dividir(String dividendo, String divisor) 
            throws DivisionPorCeroException, FormatoNumeroException {
        
        try {
            int num = Integer.parseInt(dividendo);
            int div = Integer.parseInt(divisor);
            return Calculadora.dividir(num, div);
        }
        catch(NumberFormatException fe) {
            throw new FormatoNumeroException("formato incorrecto");
        }
    }
    
}

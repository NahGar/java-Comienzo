package org.ngarcia.java8.lambda;

import org.ngarcia.java8.lambda.aritmetica.Aritmetica;
import org.ngarcia.java8.lambda.aritmetica.Calculadora;

public class EjecutarInterfaceFunctional {
    public static void main(String[] args) {
        
        //Aritmetica suma = (a,b) -> a + b;
        Aritmetica suma = Double::sum;
        Aritmetica resta = (a,b) -> a - b;
        Aritmetica division = (a,b) -> a / b;
        
        Calculadora calc = new Calculadora();
        
        System.out.println("10+5="+calc.computar(10,5,suma));
        System.out.println("10-5="+calc.computar(10,5,resta));
        System.out.println("10/5="+calc.computar(10,5,division));
        System.out.println("10*5="+calc.computar(10,5,(a,b) -> a * b));
       
        System.out.println("elevar 9 al 2="+calc.computarConBiFunction(9, 2, (a,b) -> Math.pow(a,b)));
        
    }
}

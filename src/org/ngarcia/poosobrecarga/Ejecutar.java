package org.ngarcia.poosobrecarga;

public class Ejecutar {
    public static void main(String[] args) {
     
        System.out.println("sumar int : " + Calculadora.sumar(10, 5));
        System.out.println("sumar float : " + Calculadora.sumar(10F, 5F));
        System.out.println("sumar double : " + Calculadora.sumar(10.0, 6.0));
        System.out.println("sumar string : " + Calculadora.sumar("10", "47"));
        System.out.println("sumar long : " + Calculadora.sumar(10L, 4L));

        System.out.println("sumar variable int : " + Calculadora.sumar(5, 13, 12, 43, 466));
        System.out.println("sumar float + variable int : " + Calculadora.sumar(15.5f,5, 13, 12, 43, 466));
    }

}

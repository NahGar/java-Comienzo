package org.ngarcia.poosobrecarga;

public class Ejecutar {
    public static void main(String[] args) {
     
        Calculadora calculadora = new Calculadora();
        System.out.println("sumar int : " + calculadora.sumar(10, 5));
        System.out.println("sumar float : " + calculadora.sumar(10f, 5f));
        System.out.println("sumar double : " + calculadora.sumar(10.0, 6.0));
        System.out.println("sumar string : " + calculadora.sumar("10", "47"));
        System.out.println("sumar long : " + calculadora.sumar(10l, 4l));
    }
}

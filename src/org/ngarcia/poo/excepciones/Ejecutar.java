package org.ngarcia.poo.excepciones;

import javax.swing.JOptionPane;

public class Ejecutar {
    public static void main(String[] args) {
        
        System.out.println("-Caso 1--------------------------------------------");
        
        String valor = JOptionPane.showInputDialog("ingrese un número entero: ");
        int divisor;
            
        try {
            divisor = Integer.parseInt(valor);
            double division = Calculadora.dividir(10, divisor);
            //int division = 10/ divisor;
            System.out.println(division);
        }
        catch(NumberFormatException e) {
            printError(e);
            main(args);
        }
        //catch(ArithmeticException ae) {
        //    System.out.println(ae.getMessage());
        //    main(args);
        //}
        catch(DivisionPorCeroException e) {
            printError(e);
            main(args);
        }
        finally {
            System.out.println("Finally");
        }
        
        System.out.println("-Caso 2--------------------------------------------");
        
        String dividendoStr = JOptionPane.showInputDialog("ingrese dividendo: ");
        String divisorStr = JOptionPane.showInputDialog("ingrese divisor: ");
        try {
            System.out.println("resultado: " + Calculadora.dividir(dividendoStr, divisorStr));
        }
        catch(DivisionPorCeroException e) {
            printError(e);
            main(args);
        }
        catch(FormatoNumeroException e) {
            printError(e);
            main(args);
        }
        
    }
    
    private static void printError(Exception e) {
        System.out.println(e.getMessage()+"\n");
        //for (StackTraceElement element : e.getStackTrace()) {
        //    System.out.println(element);
        //}
        e.printStackTrace(System.out);
    }
}

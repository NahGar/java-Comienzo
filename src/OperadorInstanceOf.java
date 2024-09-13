/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nahuel
 */
public class OperadorInstanceOf {
    
    public static void main(String[] args) {
        
        String texto = "Creando un objeto de la clase String";
        //equivale a String texto = new String("Creando un objeto de la clase String");

        Integer num = 7; //Integer num = new Integer(7);
        
        //boolean b1 = texto instanceof String;
        boolean b1 = texto instanceof String;
        
        System.out.println("texto es del tipo String " + b1);
        
        b1 = texto instanceof Object;
        
        System.out.println("texto es del tipo Object " + b1);
        
        b1 = num instanceof Integer;
        
        System.out.println("num es del tipo Integer " + b1);
        
        b1 = num instanceof Number;
        
        System.out.println("num es del tipo Number " + b1);
        
        Object texto1 = "Creando un objeto de la clase String";
        
        b1 = texto1 instanceof String;
        
        System.out.println("texto1 es del tipo String " + b1);
        
    }
}

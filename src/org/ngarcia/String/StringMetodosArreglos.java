package org.ngarcia.String;

public class StringMetodosArreglos {

    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";

        char[] arregloChar = trabalenguas.toCharArray();
        int largo = arregloChar.length;
        for( int i = 0; i < largo; i++) {
            System.out.println("arreglo:"+arregloChar[i]);
        }

        System.out.println();

        String archivo = "alguna.imagen.jpg";
        String[] arregloString = archivo.split("\\."); //el caracter punto va así por RegEx
        for( int i = 0; i < arregloString.length; i++) {
            System.out.println("arreglo:"+arregloString[i]);
        }
    }
}

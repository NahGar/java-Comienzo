package org.ngarcia.string;

public class StringExtensionArchivo {

    public static void main(String[] args) {

        String archivo = "alguna_imagen.pepe.jpg";

        int indexPunto = archivo.lastIndexOf(".");
        String extension = archivo.substring(indexPunto + 1);
        //String nombreArchivo = archivo.replace("."+extension,"");
        String nombreArchivo = archivo.substring(0,indexPunto);

        StringBuilder sb = new StringBuilder();
        sb.append("Nombre archivo:").append(nombreArchivo).append(" extensión:").append(extension);
        System.out.println(sb.toString());

    }
}

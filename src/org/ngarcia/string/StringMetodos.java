package org.ngarcia.string;

public class StringMetodos {

    public static void main(String[] args) {
        String nombre = "Andrés";

        System.out.println("nombre.length():" + nombre.length());
        System.out.println("nombre.toUpperCase():" + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase():" + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Andrés\"):" + nombre.equals("Andrés"));
        System.out.println("nombre.equalsIgnoreCase(\"andrés\"):" + nombre.equalsIgnoreCase("andrés"));
        System.out.println("nombre.compareTo(\"Andrés\"):" + nombre.compareTo("Andrés"));
        System.out.println("nombre.compareTo(\"Aaron\"):" + nombre.compareTo("Aaron"));
        System.out.println("nombre.charAt(0):" + nombre.charAt(0));
        System.out.println("nombre.charAt(1):" + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1):" + nombre.substring(1));
        System.out.println("nombre.substring(1,3):" + nombre.substring(1,3));
        System.out.println("nombre.substring(nombre.length()-1):" + nombre.substring(nombre.length()-1));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\",\".\"):" + trabalenguas.replace("a","."));
        System.out.println("trabalenguas.indexOf(\"ab\"):" + trabalenguas.indexOf("ab"));
        System.out.println("trabalenguas.lastIndexOf(\"a\"):" + trabalenguas.lastIndexOf("a"));
        System.out.println("trabalenguas.contains(\"gu\"):" + trabalenguas.contains("gu"));
        System.out.println("trabalenguas.startsWith(\"trav\"):" + trabalenguas.startsWith("trav"));
    }
}

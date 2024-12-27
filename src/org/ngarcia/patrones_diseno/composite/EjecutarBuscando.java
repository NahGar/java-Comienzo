package org.ngarcia.patrones_diseno.composite;

public class EjecutarBuscando {
    public static void main(String[] args) {

        Directorio doc = new Directorio("Documentos");
        Directorio java = new Directorio("Java");
        java.addComponente(new Archivo("patron-composite.docx"));
        Directorio stream = new Directorio("Api Stream");
        stream.addComponente(new Archivo("stream-map.docx"));
        java.addComponente(stream);

        doc.addComponente(java);
        doc.addComponente(new Archivo("Cv.docx"));
        doc.addComponente(new Archivo("logo.jpg"));

        boolean encontrado = doc.buscar("patron-composite.docx");
        System.out.println("patron-composite.docx:"+encontrado);

        encontrado = doc.buscar("Api stream");
        System.out.println("Api stream:"+encontrado);
    }
}


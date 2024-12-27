package org.ngarcia.archivos;

import org.ngarcia.archivos.servicio.ArchivoServicio;

public class Ejecutar {

    public static void main(String[] args) {
        String nombreArchivo = "D:\\tmp\\archivo.txt";
        ArchivoServicio service = new ArchivoServicio();
        //service.crearArchivo(nombreArchivo);
        service.crearArchivo2(nombreArchivo);

        System.out.println(service.leerArchivo2(nombreArchivo));
    }

}

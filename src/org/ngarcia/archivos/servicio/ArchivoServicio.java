package org.ngarcia.archivos.servicio;

import java.io.*;
import java.util.Scanner;

public class ArchivoServicio {

    public void crearArchivo(String nombre) {
        File archivo = new File(nombre);
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo,true))) {
            //Estas 2 líneas se ecriben en el try(), otra forma. No necesita el close() del final
            //FileWriter escritor = new FileWriter(archivo,true);
            //BufferedWriter buffer = new BufferedWriter(escritor)

            //Filewriter por cada append graba en disco
            //BufferedWriter graba cuando se supera el tamaño del buffer (8192 default)
            //escritor.append("\nProbando").append("\nappend");
            //escritor.close();
            buffer.append("\nProbando").append("\nappend");
            //buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void crearArchivo2(String nombre) {
        File archivo = new File(nombre);
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(archivo,true))) {
            printWriter.println("\nPrueba con printwriter");
            printWriter.println("Otra línea");
            printWriter.printf("utilizando %s","printf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String leerArchivo(String nombre) {

        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try (BufferedReader buffer = new BufferedReader(new FileReader(archivo))) {
            while(buffer.readLine() != null) {
                sb.append(buffer.readLine()).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  sb.toString();
    }

    public String leerArchivo2(String nombre) {

        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try (Scanner s = new Scanner(new FileReader(archivo))) {
            s.useDelimiter("\n");
            while(s.hasNext()) {
                sb.append(s.next()).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  sb.toString();
    }
}

package org.ngarcia.pooherencia;

public class Ejecutar {

    public static void main(String[] args) {

        Alumno alumno = new Alumno();
        alumno.setNombre("Pedro");
        alumno.setApellido("Rodríguez");
        Profesor profesor = new Profesor();
        profesor.setNombre("Carlos");
        profesor.setApellido("Benítez");
        profesor.setAsignatura("Matemáticas");
        System.out.println("Alumno: " + alumno.getNombre() + " " +alumno.getApellido());
        System.out.println("Profesor " + profesor.getAsignatura() + ": " + profesor.getNombre()
                + " " +profesor.getApellido());
    }
}

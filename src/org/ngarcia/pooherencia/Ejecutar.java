package org.ngarcia.pooherencia;

public class Ejecutar {

    public static void main(String[] args) {

        //Alumno alumno = new Alumno();
        //alumno.setNombre("Pedro");
        //alumno.setApellido("Rodríguez");
        Alumno alumno = new Alumno("Pedro", "Rodríguez", 17, "Carmelitas descalzas");
        alumno.setNotaHistoria(7.5);
        alumno.setNotaLenguaje(8);
        alumno.setNotaMatematica(5);
        alumno.setEmail("aaa@ccc.com");
        
        //AlumnoInternacional alumnoInt = new AlumnoInternacional();
        //alumnoInt.setNombre("Peter");
        //alumnoInt.setApellido("Gosling");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto nacional");
        alumnoInt.setNotaIdiomas(6);
        alumnoInt.setNotaMatematica(9);
        alumnoInt.setNotaLenguaje(3.5);
        alumnoInt.setNotaHistoria(8);
        alumnoInt.setEmail("bbb@ccc.com");
                
        //Profesor profesor = new Profesor();
        //profesor.setNombre("Carlos");
        //profesor.setApellido("Benítez");
        Profesor profesor = new Profesor("Carlos","Benítez");
        profesor.setAsignatura("Matemáticas");
        profesor.setEdad(50);
        profesor.setEmail("ddd@ccc.com");
                
        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);
        
        Class clase = alumnoInt.getClass();
        while( clase.getSuperclass() != null ) {
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println( hija + " es una clase hija de " + padre);
            clase = clase.getSuperclass();
        }
        
    }
    
    public static void imprimir(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre() + " " 
                + persona.getApellido() + ", edad: " + persona.getEdad()
                + ", email: " + persona.getEmail());
        if( persona instanceof Alumno ) {
            System.out.println("Institución: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota mates: " + ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota hisoria: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota lenguaje: " + ((Alumno) persona).getNotaLenguaje());
            
            if( persona instanceof AlumnoInternacional ) {
                System.out.println("Nota idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("País: " + ((AlumnoInternacional) persona).getPais());
            }
        }
        if( persona instanceof Profesor ) {
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }
        
    }
}

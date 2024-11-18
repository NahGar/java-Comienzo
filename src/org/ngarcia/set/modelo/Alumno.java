package org.ngarcia.set.modelo;

import java.util.Objects;

public class Alumno implements Comparable<Alumno>{
    private String nombre;
    private int nota;

    public Alumno() {  }

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nombre + ", nota=" + nota;
    }

    @Override
    public int compareTo(Alumno o) {
        //if(this.nombre == null) { 
        //    return 0;
        //}
        //return this.nombre.compareTo(o.getNombre());
        int result = 0;
        if (this.nota == o.getNota()) {
            result = 0;
        }
        else if (this.nota > o.getNota()) {
            result = 1;
        }
        else if (this.nota < o.getNota()) {
            result = -1;
        }
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre,nota);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        final Alumno other = (Alumno) obj;
        return Objects.equals(this.nota, other.nota) &&
               Objects.equals(this.nombre, other.nombre);
    }
    
}

package org.ngarcia.anotaciones.models;

import org.ngarcia.anotaciones.Init;
import org.ngarcia.anotaciones.JsonAtributo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Producto {

    //@JsonAtributo(nombre = "descripción") //cambia el nombre del campo en json
    @JsonAtributo()
    private String nombre;

    //@JsonAtributo(nombre = "costo") //cambia el nombre del campo en json
    @JsonAtributo
    private Long precio;

    private LocalDate fecha;

    @Init
    private void init() {
        this.nombre = Arrays.stream(this.nombre.split(" "))
                .map( p -> String.valueOf(p.charAt(0)).toUpperCase() +
                        p.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}

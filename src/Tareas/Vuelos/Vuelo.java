package Tareas.Vuelos;

import java.util.Date;

public class Vuelo implements Comparable<Vuelo> {

    private String vuelo;
    private String origen;
    private String destino;
    private Date fechaLlegada;
    private Integer cantidadPasajeros;

    public Vuelo(String vuelo, String origen, String destino, Date fechaLlegada, Integer cantidadPasajeros) {
        this.vuelo = vuelo;
        this.origen = origen;
        this.destino = destino;
        this.fechaLlegada = fechaLlegada;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getVuelo() {
        return vuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public Integer getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    @Override
    public int compareTo(Vuelo o) {
        return this.fechaLlegada.compareTo(o.getFechaLlegada());
    }

    @Override
    public String toString() {
        return  "Vuelo='" + vuelo + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fechaLlegada=" + fechaLlegada +
                ", cantidadPasajeros=" + cantidadPasajeros;
    }
}

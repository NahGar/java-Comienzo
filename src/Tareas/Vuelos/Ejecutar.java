package Tareas.Vuelos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Ejecutar {
    public static void main(String[] args) {

        ArrayList<Vuelo> vuelos = new ArrayList<>();

        vuelos.add(new Vuelo("AAL 933","New York","Santiago", cvStrToDate("2021-08-29 05:39"),62));
        vuelos.add(new Vuelo("LAT 755","Sao Paulo","Santiago", cvStrToDate("2021-08-31 04:45"),47));
        vuelos.add(new Vuelo("SKU 621","Rio de Janeiro","Santiago", cvStrToDate("2021-08-30 16:00"),52));
        vuelos.add(new Vuelo("DAL 147","Atlanta","Santiago", cvStrToDate("2021-08-29 13:22"),59));
        vuelos.add(new Vuelo("AVA 241","Bogota","Santiago", cvStrToDate("2021-08-31 14:05"),25));
        vuelos.add(new Vuelo("AMX 10","Mexico City","Santiago", cvStrToDate("2021-08-31 05:20"),29));
        vuelos.add(new Vuelo("IBE 6833","Londres","Santiago", cvStrToDate("2021-08-30 08:45"),55));
        vuelos.add(new Vuelo("LAT 2479","Frankfurt","Santiago", cvStrToDate("2021-08-29 07:41"),51));

        vuelos.add(new Vuelo("SKU 803","Lima","Santiago", cvStrToDate("2021-08-30 10:35"),48));
        vuelos.add(new Vuelo("LAT 533","Los Angeles","Santiago", cvStrToDate("2021-08-29 09:14"),59));
        vuelos.add(new Vuelo("LAT 1447","Guayaquil","Santiago", cvStrToDate("2021-08-31 08:33"),31));
        vuelos.add(new Vuelo("CMP 111","Panama City","Santiago", cvStrToDate("2021-08-31 15:15"),29));

        for(Vuelo vuelo: vuelos) {
            System.out.println(vuelo);
        }

        Collections.sort(vuelos);

        System.out.println("-----------ordenado----------------");

        for(Vuelo vuelo: vuelos) {
            System.out.println(vuelo);
        }

        System.out.println("Ultimo vuelo en llegar: " + ultimoVueloEnLlegar(vuelos));
        System.out.println("Vuelo con menos pasajeros: " + vueloConMenosPasajeros(vuelos));

    }

    private static Vuelo ultimoVueloEnLlegar(ArrayList<Vuelo> vuelos) {

        Vuelo ultimoVuelo = null;
        vuelos.sort( (a,b) -> b.getFechaLlegada().compareTo(a.getFechaLlegada()) );
        for(Vuelo vuelo : vuelos) {
            ultimoVuelo = vuelo;
            break;
        }
        return ultimoVuelo;
    }

    private static Vuelo vueloConMenosPasajeros(ArrayList<Vuelo> vuelos) {

        Vuelo vueloMenosPasajeros = null;
        vuelos.sort( (a,b) -> a.getCantidadPasajeros().compareTo(b.getCantidadPasajeros()) );
        for(Vuelo vuelo : vuelos) {
            vueloMenosPasajeros = vuelo;
            break;
        }
        return vueloMenosPasajeros;
    }

    private static Date cvStrToDate(String dateStr) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            return formatter.parse(dateStr);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}

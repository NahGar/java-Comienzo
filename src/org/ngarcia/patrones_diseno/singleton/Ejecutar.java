package org.ngarcia.patrones_diseno.singleton;

public class Ejecutar {
    public static void main(String[] args) {

        ConexionBDSingleton conn = ConexionBDSingleton.getInstancia();
        System.out.println(conn);
        conn = ConexionBDSingleton.getInstancia();
        System.out.println(conn);
    }
}

package org.ngarcia.patrones_diseno.singleton;

//existe un única instancia de esta clase
//el constructor es privado
//se resuelve con el metodo publico estatico que crea
//el objeto la primera vez y luego siempre retorna
//esa instancia
public class ConexionBDSingleton {

    private static ConexionBDSingleton instancia;

    private ConexionBDSingleton() {
        System.out.println("Conectando");
    }

    public static ConexionBDSingleton getInstancia() {
        if(instancia == null) {
            instancia = new ConexionBDSingleton();
        }
        return instancia;
    }
}

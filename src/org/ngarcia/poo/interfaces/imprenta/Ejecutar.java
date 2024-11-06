package org.ngarcia.poo.interfaces.imprenta;

import org.ngarcia.poo.interfaces.imprenta.modelo.*;

public class Ejecutar {
    
    public static void main(String[] args) {
        
        Curriculum cv = new Curriculum(new Persona("Pepe","Mujica"), "Analista de sistemas", "Resumen, experiencia, etc");
        cv.addExperiencia("Java").addExperiencia("Angular").addExperiencia("Sql");

        Libro libro = new Libro(new Persona("J.R.R.","Tokien"),"TLOTR",EnumGenero.AVENTURA);

        Informe informe = new Informe(new Persona("Martin C", "Martinez"),
                new Persona("Acevedo", "Díaz"), "Estudio de microservicios");
        libro.addPagina(new Pagina("La comunidad del anillo"))
             .addPagina(new Pagina("Las dos torres"))
             .addPagina(new Pagina("El retorno del rey"));

        //imprimir(cv);
        //imprimir(informe);
        //imprimir(libro);
        Imprimible.imprimir(cv);
        Imprimible.imprimir(informe);
        Imprimible.imprimir(libro);

        //Anónima
        Imprimible.imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return "Función anónima";
            }
        });

        //Valor default
        Imprimible.imprimir(new Imprimible() {

        });
    }   
    
    //public static void imprimir(Hoja imprimible) {
    //    System.out.println(imprimible.imprimir());
    //}

    //Llevamos al método a la interface
    //public static void imprimir(Imprimible imprimible) {
    //    System.out.println(imprimible.imprimir());
    //}
}

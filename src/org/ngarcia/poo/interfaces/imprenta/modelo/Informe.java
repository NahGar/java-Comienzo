package org.ngarcia.poo.interfaces.imprenta.modelo;

public class Informe extends Hoja implements Imprimible {

    private Persona autor;
    private Persona revisor;
    
    public Informe(Persona autor, Persona revisor, String contenido) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }
    
    @Override
    public String imprimir() {
        return "\nInforme escrito por: " + autor +
               "\nRevisador por: " + revisor +
               "\n" + contenido;
    }
    
    
}

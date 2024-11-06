package org.ngarcia.poo.interfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible {

    //paginas puede ser del tipo Hoja o Imprimible (usa este último por ser el más genérico)
    //private List<Hoja> paginas;
    private List<Imprimible> paginas;
    private Persona autor;
    private String titulo;
    private EnumGenero genero;

    public Libro(Persona autor, String titulo, EnumGenero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }
    
    //public Libro addPagina(Hoja pagina) {
    public Libro addPagina(Imprimible pagina) {
        this.paginas.add(pagina);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("\nLibro Título: ")
                .append(this.titulo).append("\nAutor: ").append(this.autor)
                .append("\nGenero: ").append(this.genero).append("\n");
        //for(Hoja pag: this.paginas) {
        for(Imprimible pag: this.paginas) {
            sb.append(pag.imprimir()).append("\n");
        }
        return sb.toString();
    }
}

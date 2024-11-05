package org.ngarcia.poo.interfaces.imprenta.modelo;

import java.util.List;

public class Libro {
    
    private List<Hoja> paginas;
    private String autor;
    private String titulo;
    private EnumGenero genero;

    public Libro(String autor, String titulo, EnumGenero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }
    
    public Libro addPagina(Hoja pagina) {
        this.paginas.add(pagina);
        return this;
    }
    
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Título: ")
                .append(this.titulo).append("\nAutor: ").append(this.autor)
                .append("\nGenero: ").append(this.genero).append("\n");
        for(Hoja pag: this.paginas) {
            sb.append(pag.imprimir()).append("\n");
        }
        return sb.toString();
    }
}

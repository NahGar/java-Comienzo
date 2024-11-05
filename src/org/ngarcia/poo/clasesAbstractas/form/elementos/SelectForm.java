package org.ngarcia.poo.clasesAbstractas.form.elementos;

import org.ngarcia.poo.clasesAbstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm {

    private List<Opcion> opciones;

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opcion>();
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    //retorna SelectForm para utilizar addOpcion encadenado
    public SelectForm addOpcion( Opcion opcion ) {
        this.opciones.add(opcion);
        return this;
    }

    public void setSelectedValor(String valor) {

        for(Opcion opcion: this.opciones) {
            if(opcion.getValor().equals(valor) ) {
                opcion.setSelected(true);
                break;
            }
        }
    }

    @Override
    public String dibujarHtml() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name='").append(this.nombre).append("'>");

        for(Opcion opcion: this.opciones) {
            if(opcion.isSelected()) {
                sb.append("\n<option value='").append(opcion.getValor()).append("' selected>")
                        .append(opcion.getNombre()).append("</option>");
                this.valor = opcion.getValor();
            }
            else {
                sb.append("\n<option value='").append(opcion.getValor()).append("'>")
                        .append(opcion.getNombre()).append("</option>");
            }
        }
        sb.append("\n</select>");

        return sb.toString();
    }
}

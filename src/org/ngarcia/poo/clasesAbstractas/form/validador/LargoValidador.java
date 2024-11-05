package org.ngarcia.poo.clasesAbstractas.form.validador;

import org.ngarcia.poo.clasesAbstractas.form.validador.mensaje.IMensajeFormateable;

public class LargoValidador extends Validador implements IMensajeFormateable {

    protected String mensaje = "el campo '%s' debe tener mínimo %d caracteres y máximo %d caracteres";
    private int min = 0;
    private int max = Integer.MAX_VALUE;

    public LargoValidador() {}

    public LargoValidador(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void setMin(int min) { this.min = min; }

    public void setMax(int max) { this.max = max; }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return this.mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        //para evitar nullpointerexception, hay un validador para null
        if( valor == null ) {
            return true;
        }
        //this.mensaje = String.format(this.mensaje,this.min,this.max);
        
        return (valor.length() >= this.min && valor.length() <= this.max);
    }
    
    //se implementa interface
    /*
    public String getMensajeFormateado(String campo) {
        return String.format(this.mensaje,campo,this.min,this.max);
    }*/

    @Override
    public String getMensajeFormateado(String campo) {
        return String.format(this.mensaje,campo,this.min,this.max);
    }
    
    
}

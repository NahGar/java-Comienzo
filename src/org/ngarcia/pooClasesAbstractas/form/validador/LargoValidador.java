package org.ngarcia.pooClasesAbstractas.form.validador;

public class LargoValidador extends Validador {

    protected String mensaje = "el campo debe tener mínimo %d caracteres y máximo %d caracteres";
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
        this.mensaje = String.format(this.mensaje,this.min,this.max);
        return (valor.length() >= this.min && valor.length() <= this.max);
    }
}

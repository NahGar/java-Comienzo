package org.ngarcia.pooClasesAbstractas.form.validador;

public class RequeridoValidador extends Validador{

    protected String mensaje = "el campo es requerido";

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
        return (valor != null && valor.length() > 0);
        //return (valor != null && !valor.isBlank());
    }
}

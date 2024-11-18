package org.ngarcia.objetos;

public class Motor {

    private double cilindrada;
    private TipoMotorEnum tipo;

    public Motor() {
    }

    public Motor(double cilindrada, TipoMotorEnum tipo) {
        this.cilindrada = cilindrada;
        this.tipo = tipo;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public TipoMotorEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoMotorEnum tipo) {
        this.tipo = tipo;
    }

}

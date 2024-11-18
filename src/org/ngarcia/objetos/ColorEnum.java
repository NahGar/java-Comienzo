package org.ngarcia.objetos;

public enum ColorEnum {
    //funciona como que los valores son métodos
    ROJO("rojo"),
    NEGRO("negro"),
    BLANCO("blanco"),
    AZUL("azul"),
    VERDE("verde"),
    GRIS("gris");

    private final String color;

    ColorEnum(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}

package Tareas.mamiferos;

abstract public class Canino extends Mamifero {
    
    protected String tamaño;
    protected double colmillos;

    public Canino(String tamaño, double colmillos, String habitat, double altura, double largo, double peso, String nombreCientifico) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamaño = tamaño;
        this.colmillos = colmillos;
    }

    public String getTamaño() {
        return tamaño;
    }

    public double getColmillos() {
        return colmillos;
    }
    
}

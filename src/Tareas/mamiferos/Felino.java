package Tareas.mamiferos;

abstract public class Felino extends Mamifero {
    
    protected double garras;
    protected int velocidad;

    public Felino(double garras, int velocidad, String habitat, double altura, double largo, double peso, String nombreCientifico) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.garras = garras;
        this.velocidad = velocidad;
    }

    public double getGarras() {
        return garras;
    }

    public int getVelocidad() {
        return velocidad;
    }
        
}

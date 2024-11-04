package Tareas.mamiferos;

abstract public class Mamifero {
    
    protected String habitat;
    protected double altura;
    protected double largo;
    protected double peso;
    protected String nombreCientifico;

    public Mamifero(String habitat, double altura, double largo, double peso, String nombreCientifico) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }

    public String getHabitat() {
        return habitat;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargo() {
        return largo;
    }

    public double getPeso() {
        return peso;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }
    
    abstract String comer();
    abstract String dormir();
    abstract String correr();
    abstract String comunicarse();
    
}

package Tareas.mamiferos;

public class Leon extends Felino {
 
    private int numeroManada;
    private double potenciaRugido;

    public Leon(int numeroManada, double potenciaRugido, double garras, int velocidad, String habitat, double altura, double largo, double peso, String nombreCientifico) {
        super(garras, velocidad, habitat, altura, largo, peso, nombreCientifico);
        this.numeroManada = numeroManada;
        this.potenciaRugido = potenciaRugido;
    }
    
    @Override
    String comer() {
        return "El león devora su cena junto a los " + numeroManada + " integrantes de la manada";
    }

    @Override
    String dormir() {
        return "El león dormita";
    }

    @Override
    String correr() {
        return "El león corre pero no muy deprisa";
    }

    @Override
    String comunicarse() {
        return "El león se comunica con sus pares";
    }
}

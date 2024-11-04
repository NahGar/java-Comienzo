package Tareas.mamiferos;

public class Lobo extends Canino {
   
    private int numeroCamada;
    private String especieLobo;

    public Lobo(int numeroCamada, String especieLobo, String tamaño, double colmillos, String habitat, double altura, double largo, double peso, String nombreCientifico) {
        super(tamaño, colmillos, habitat, altura, largo, peso, nombreCientifico);
        this.numeroCamada = numeroCamada;
        this.especieLobo = especieLobo;
    }
    
    @Override
    String comer() {
        return "El lobo " + especieLobo + " come con rapidez";
    }

    @Override
    String dormir() {
        return "El lobo duerme junto a su camada de " + numeroCamada + " miembros";
    }

    @Override
    String correr() {
        return "El lobo corre, se detiene y maulla";
    }

    @Override
    String comunicarse() {
        return "El lobo deja una rastro para comunicar su ubicación";
    }
}

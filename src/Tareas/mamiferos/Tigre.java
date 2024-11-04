package Tareas.mamiferos;

public class Tigre extends Felino {
    
    private String especieTigre;

    public Tigre(String especieTigre, double garras, int velocidad, String habitat, double altura, double largo, double peso, String nombreCientifico) {
        super(garras, velocidad, habitat, altura, largo, peso, nombreCientifico);
        this.especieTigre = especieTigre;
    }
    
    @Override
    String comer() {
        return "El tigre " + especieTigre + " no puede comer";
    }

    @Override
    String dormir() {
        return "El tigre descansa";
    }

    @Override
    String correr() {
        return "El tigre corre y pega un salto";
    }

    @Override
    String comunicarse() {
        return "El tigre hace tremendo ruido al comunicarse";
    }
}

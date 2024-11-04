package Tareas.mamiferos;

public class Guepardo extends Felino {

    public Guepardo(double garras, int velocidad, String habitat, double altura, double largo, float peso, String nombreCientifico) {
        super(garras, velocidad, habitat, altura, largo, peso, nombreCientifico);
    }
    
    @Override
    String comer() {
        return "El guepardo devora su cena";
    }

    @Override
    String dormir() {
        return "El guepardo descansa";
    }

    @Override
    String correr() {
        return "El guepardo corre demasiado rápido";
    }

    @Override
    String comunicarse() {
        return "El guepardo se comunica con sus pares";
    }
}

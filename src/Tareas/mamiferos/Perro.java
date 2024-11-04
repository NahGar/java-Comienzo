package Tareas.mamiferos;

public class Perro extends Canino {
    
    private int fuerzaMordida;

    public Perro(int fuerzaMordida, String tamaño, double colmillos, String habitat, double altura, double largo, double peso, String nombreCientifico) {
        super(tamaño, colmillos, habitat, altura, largo, peso, nombreCientifico);
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    String comer() {
        return "El perro come con una fuerza de mordida de " + fuerzaMordida;
    }

    @Override
    String dormir() {
        return "El perro duerme tranquilamente";
    }

    @Override
    String correr() {
        return "El perro corre a gran velocidad";
    }

    @Override
    String comunicarse() {
        return "El perro ladra llamando la atención";
    }
}

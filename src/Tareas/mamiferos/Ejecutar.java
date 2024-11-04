package Tareas.mamiferos;

public class Ejecutar {
    
    public static void main(String[] args) {
        
        Mamifero[] mamiferos = new Mamifero[5];
    
        Mamifero leon = new Leon(10, 5, 4, 40, "Africa", 40, 80, 120, "Simba");
        Mamifero guepardo = new Guepardo(12, 90, "Africa", 70, 30, 100, "Guepardo");
        Mamifero tigre = new Tigre("Especie tigre", 50, 70, "Sudamerica", 40, 70, 80, "Tigrín");
        Mamifero perro = new Perro(800, "grandote", 88, "Uruguay", 88, 55, 40, "Goofy") ;
        Mamifero lobo = new Lobo(77, "Lobezno", "Pequeñín", 77, "Chile", 76, 174, 95, "Lobus operandi");

        mamiferos[0] = leon;
        mamiferos[1] = guepardo;
        mamiferos[2] = tigre;
        mamiferos[3] = perro;
        mamiferos[4] = lobo;

        for(Mamifero animal : mamiferos ) {
            if(animal != null) {
                System.out.println(animal.comer());
                System.out.println(animal.comunicarse());
                System.out.println(animal.correr());
                System.out.println(animal.dormir());
            }
        }
    }
}

package Tareas.personascompania;

public class Ejecutar {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Carlos","Méndez","15478-6578",
                "Su casa 1547", 250000.00, 154);
        gerente.setPresupuesto(8000000.00);
        System.out.println("Gerente " + gerente);
    }
}

package Tareas.personascompania;

public class Gerente extends  Empleado {

    private Double presupuesto;

    public Gerente(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Gerente(String nombre, String apellido, Double remuneracion, int empleadoId) {
        super(nombre, apellido, remuneracion, empleadoId);
    }

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, Double remuneracion, int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion, remuneracion, empleadoId);
    }

    public Double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString() + ", presupuesto=" + presupuesto;
    }
}

package Tareas.personascompania;

public class Empleado extends Persona {

    private Double remuneracion;
    private int empleadoId;

    public Empleado(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Empleado(String nombre, String apellido, Double remuneracion, int empleadoId) {
        super(nombre, apellido);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, Double remuneracion, int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public Double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(Double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    public void aumentarRemuneracion(int porcentaje) {
        Double aumento = this.remuneracion * porcentaje / 100;
        setRemuneracion( this.remuneracion + aumento);
    }

    @Override
    public String toString() {
        return  super.toString() + ", remuneracion=" + remuneracion +
                ", empleadoId=" + empleadoId;
    }
}

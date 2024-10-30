package Tareas.personascompania;

public class Cliente extends Persona {

    int clienteId;

    public Cliente(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Cliente(String nombre, String apellido, int clienteId) {
        super(nombre, apellido);
        this.clienteId = clienteId;
    }

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion, int clienteId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId = clienteId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    @Override
    public String toString() {
        return  super.toString() + ", clienteId=" + clienteId;
    }
}

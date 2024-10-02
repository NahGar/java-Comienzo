package Objetos;

public class Automovil {

    String fabricante;
    String modelo;
    String color = "gris";
    double cilindrada;

    public String detalle() {
        StringBuilder sb = new StringBuilder();
        sb.append("fabricante:"+this.fabricante);
        sb.append("\nmodelo:"+this.modelo);
        sb.append("\ncolor:"+this.color);
        sb.append("\ncilindrada:"+this.cilindrada);
        return sb.toString();
    }
}

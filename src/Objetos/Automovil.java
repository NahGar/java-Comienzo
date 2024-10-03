package Objetos;

public class Automovil {

    String fabricante;
    String modelo;
    String color = "gris";
    double cilindrada;
    int capacidadTanque = 40;

    public String verDetalle() {
        return  "fabricante:"+this.fabricante +
                "\nmodelo:"+this.modelo +
                "\ncolor:"+this.color +
                "\ncilindrada:"+this.cilindrada;
    }
    
    public String acelerar(int rpm) {
        return "el auto " + this.fabricante + " acelerando a " + rpm + "rpm";
    }
    
    public String frenar() {
        return "el auto " + this.fabricante + " frenando";
    }
    
    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }
    
    public float calcularConsumo(int km, float porcentajeBencina) {
        return km/(this.capacidadTanque * porcentajeBencina);
    }
}

package Objetos;

public class Automovil {

    private String fabricante;
    private String modelo;
    private String color = "gris";
    private double cilindrada;
    private int capacidadTanque = 40;

    public Automovil() {} //constructor sin parametros
    
    public Automovil(String fabricante, String modelo) { //constructor
        this.fabricante = fabricante;
        this.modelo = modelo;        
    }
    
    public Automovil(String fabricante, String modelo, String color) { //constructor
        this(fabricante,modelo);
        this.color = color;
    }
    
    public String getFabricante() {
        return this.fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getCilindrada() {
        return this.cilindrada;
    }
    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
    public int getCapacidadTanque() {
        return this.capacidadTanque;
    }
    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }
    
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
    
    public float calcularConsumo(int km, int porcentajeBencina) {
        return km/(this.capacidadTanque * (porcentajeBencina/100f));
    }
    
    @Override
    public boolean equals(Object obj) {
        
        //si es el mismo obj
        if(this == obj) {
            return true;
        }
        
        //verifica antes de comparar que coincidan los tipos (si no da error en cast)
        if( !(obj instanceof Automovil) ) {
            return false;
        }
        
        Automovil a = (Automovil)obj;
        
        //los nulos dan error 
        if(a.fabricante == null || a.modelo == null || this.fabricante == null || this.modelo == null ) {
            return false;
        }
        
        return (a.fabricante.equals(this.getFabricante()) && 
                a.modelo.equals(this.getModelo()));
    }
    
    @Override
    public String toString() {
        return "\n" + "Automovil {\n" + 
                "  fabricante='" + fabricante + '\'' + "\n" +
                "  modelo='" + modelo + '\'' +"\n" +
                "  color='" + color + '\'' +"\n" +
                "  cilindrada=" + cilindrada + "\n" +
                "  capacidadTanque=" + capacidadTanque + "\n" +
                "}";
    }
    
}

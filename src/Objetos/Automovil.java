package Objetos;

import java.awt.*;

public class Automovil {

    private int id;
    private String fabricante;
    private String modelo;
    private ColorEnum color = ColorEnum.NEGRO;
    private double cilindrada;
    private int capacidadTanque = 40;
    private TipoAutomovilEnum tipo;
    private static int ultimoId;

    //constante
    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120;
    
    //corresponde a la clase y aplica a todas las instancias el cambio
    private static ColorEnum colorPatente = ColorEnum.VERDE;
    private static int capacidadTanqueStatic = 30;

    //COLORES
    //public static final String COLOR_ROJO = "Rojo";
    //public static final String COLOR_NEGRO = "Negro";
    //public static final String COLOR_BLANCO = "Blanco";
    //public static final String COLOR_VERDE = "Verde";

    public Automovil() { //constructor sin parametros
        this.id = ++ultimoId; //ambos quedan incrementados en 1
    } 
    
    public Automovil(String fabricante, String modelo) { //constructor
        this(); //para ejecutar el constructor sin parámetros
        this.fabricante = fabricante;
        this.modelo = modelo;        
    }
    
    public Automovil(String fabricante, String modelo, ColorEnum color) { //constructor
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
    public ColorEnum getColor() {
        return this.color;
    }
    public void setColor(ColorEnum color) {
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
    
    public TipoAutomovilEnum getTipo() {
        return this.tipo;
    }
    public void setTipo(TipoAutomovilEnum tipo) {
        this.tipo = tipo;
    }
    
    //deben ser static
    public static ColorEnum getColorPatente() {
        return colorPatente;
    }
    //deben ser static
    public static void setColorPatente(ColorEnum colorPatente) {
        Automovil.colorPatente = colorPatente;
    }
    
    public String verDetalle() {
        return  "id:"+this.id +
                "\nfabricante:"+this.getFabricante() +
                "\nmodelo:"+this.getModelo() +
                "\ntipo:"+this.getTipo().getDescripcion() + " (" + this.getTipo().getNumeroPuertas() + ")" +
                "\ncolor:"+this.color.getColor() +
                "\ncilindrada:"+this.cilindrada +
                "\ncolorPatente:"+ colorPatente;
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
    
    //No puede hacer referencia a atributos que no sean static
    public static float calcularConsumoStatic(int km, int porcentajeBencina) {
        return km/(capacidadTanqueStatic * (porcentajeBencina/100f));
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
                "  id=" + id + "\n" +
                "  fabricante='" + fabricante + '\'' + "\n" +
                "  modelo='" + modelo + '\'' +"\n" +
                "  color='" + color + '\'' +"\n" +
                "  cilindrada=" + cilindrada + "\n" +
                "  capacidadTanque=" + capacidadTanque + "\n" +
                "}";
    }
    
}

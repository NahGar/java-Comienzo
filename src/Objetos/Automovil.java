package Objetos;

//implements Comparable es para poder implementar compareTo y así ordenar un array de objs
public class Automovil implements Comparable<Automovil> {

    private int id;
    private String fabricante;
    private String modelo;
    private ColorEnum color = ColorEnum.NEGRO;
    private Motor motor;
    private Tanque tanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private int idRuedas;
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
        this.ruedas = new Rueda[5];
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

    public Automovil(String fabricante, String modelo, ColorEnum color, Motor motor, Tanque tanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color);
        this.motor = motor;
        this.tanque = tanque;
        this.conductor = conductor;
        if(ruedas != null) {
            this.ruedas = ruedas;
        }
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

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Tanque getTanque() {
        if(this.tanque == null) {
            this.tanque = new Tanque();
        }
        return tanque;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }
    
    public Automovil addRueda(Rueda rueda) {
        if(idRuedas < this.ruedas.length ) {
            this.ruedas[idRuedas++] = rueda;
        }
        return this;
    }
    
    
    public String verDetalle() {
        String detalle = "id:"+this.id +
                "\nfabricante:"+this.getFabricante() +
                "\nmodelo:"+this.getModelo();
        if (this.getTipo() != null) { //por si no fue asignado
            detalle += "\ntipo:"+this.getTipo().getDescripcion() + " (" + this.getTipo().getNumeroPuertas() + ")";
        }
        detalle += "\ncolor:"+this.color.getColor();
        if (this.getMotor() != null) {
            detalle += "\ncilindrada:"+this.motor.getCilindrada();
        }
        detalle += "\ncolor de patente:"+ colorPatente;
        
        if(this.conductor != null ) {
            detalle += "\nconductor:"+this.conductor;
        }
        
        for(Rueda rueda: this.ruedas) {
            if(rueda != null ) {
                detalle += "\nrueda:"+rueda.getFabricante() + " ancho:" + rueda.getAncho() + 
                    " aro:" + rueda.getAro();    
            }
        }
        return detalle;
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
        return km/(this.getTanque().getCapacidad() * porcentajeBencina);
    }
    
    public float calcularConsumo(int km, int porcentajeBencina) {
        return km/(this.getTanque().getCapacidad() * (porcentajeBencina/100f));
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
                "  cilindrada=" + this.motor.getCilindrada() + "\n" +
                "  capacidadTanque=" + this.tanque.getCapacidad() + "\n" +
                "}";
    }

    @Override
    public int compareTo(Automovil auto) {
        int fabricanteComparison = this.fabricante.compareTo(auto.fabricante);
        if (fabricanteComparison != 0) {
            return fabricanteComparison;
        }
        // Si los fabricantes son iguales, se compara por modelo
        return this.modelo.compareTo(auto.modelo);
    }
}

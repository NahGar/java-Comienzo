package Objetos;

public enum TipoAutomovilEnum {
    SEDAN("Sedan","Auto mediano",4),
    STATION_WAGON("Station Wagon","Auto grande", 5),
    HATCHBACK("Hatchback","Auto compacto", 5),
    PICKUP("Pickup","Camioneta",4),
    COUPE("Coupe","Auto pequeño",2),
    CONVERTIBLE("Convertible","Auto deportivo",2),    
    SUV("SUV","Todo terreno deportivo",5),
    FURGON("Furgón","Auto utilitario",3);
    
    private final String nombre;
    private final String descripcion;
    private final int numeroPuertas;
    
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    
    TipoAutomovilEnum(String nombre, String descripcion, int numeroPuertas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPuertas = numeroPuertas;
    }
}

package Tareas.almacen;

public class Ejecutar {
    public static void main(String[] args) {

        Producto[] productos = new Producto[8];

        productos[0] = new Lacteo("leche",15.0, 2, 50);
        productos[1] = new Lacteo("flan",25.0, 4, 80);
        productos[2] = new Fruta("pera",9.0, 10, "amarillo");
        productos[3] = new Fruta("manzana",8.0, 12, "rojo");
        productos[4] = new Limpieza("cera",70.0, "NH3", 1.0);
        productos[5] = new Limpieza("lavandina",40.0, "lavandin", 1.5);
        productos[6] = new NoPerecible("arroz",20.0, 1, 70);
        productos[7] = new NoPerecible("miel",75.0, 500, 150);

        for(Producto producto: productos ){
            System.out.println(producto);
        }

    }
}

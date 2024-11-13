package Tareas.carroSupermercado;

import org.ngarcia.poo.interfaces.repositorio.EnumDireccion;

import java.util.List;

public class Ejecutar {

    public static void main(String[] args) {

        BolsaSupermercado<Fruta> bolsaFruta = new BolsaSupermercado<>();
        bolsaFruta.addProducto(new Fruta("Pera",8.0, 10.0, "amarillo"));
        bolsaFruta.addProducto(new Fruta("Manzana",7.0, 9.0, "roja"));

        for(Fruta fruta: bolsaFruta.getProductos()) {
            System.out.println(fruta.getNombre()+" "+fruta.getColor()+" "+fruta.getPeso());
        }

        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>();
        bolsaLimpieza.addProducto(new Limpieza ("Lavandina",10.0, "compon", 2.0));
        bolsaLimpieza.addProducto(new Limpieza ("Pomada",12.0, "compon", 1.0));

        for(Limpieza limpieza: bolsaLimpieza.getProductos()) {
            System.out.println(limpieza.getNombre()+" "+limpieza.getComponentes()+" "+limpieza.getLitros());
        }

        BolsaSupermercado<NoPerecible> bolsaNoPerecible = new BolsaSupermercado<>();
        bolsaNoPerecible.addProducto(new NoPerecible ("Arroz",8.0, 20, 5));
        bolsaNoPerecible.addProducto(new NoPerecible ("Cianuro",7.0, 22, 2));

        for(NoPerecible noPerecible: bolsaNoPerecible.getProductos()) {
            System.out.println(noPerecible.getNombre()+" "+noPerecible.getCalorias()+" "+noPerecible.getContenido());
        }

        BolsaSupermercado<Lacteo> bolsaLacteo = new BolsaSupermercado<>();
        bolsaLacteo.addProducto(new Lacteo ("Manteca",13.0, 5, 9));
        bolsaLacteo.addProducto(new Lacteo ("Queso",33.0, 1, 50));

        for(Lacteo lacteo: bolsaLacteo.getProductos()) {
            System.out.println(lacteo.getNombre()+" "+lacteo.getCantidad()+" "+lacteo.getProteinas());
        }
    }
}

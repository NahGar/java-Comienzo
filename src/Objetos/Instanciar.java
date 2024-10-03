package Objetos;

public class Instanciar {

    public static void main(String[] args) {

        Automovil subaru = new Automovil();
        subaru.fabricante = "Subaru";
        subaru.modelo = "Impreza";
        subaru.cilindrada = 2.0;
        subaru.color = "Blanco";
        System.out.println(subaru.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println(subaru.acelerarFrenar(2000));
        System.out.println(subaru.calcularConsumo(100,0.75f));
        subaru.capacidadTanque = 50;
        System.out.println(subaru.calcularConsumo(100,0.75f));

    }

}

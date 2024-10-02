package Objetos;

public class Instanciar {

    public static void main(String[] args) {

        Automovil subaru = new Automovil();
        subaru.fabricante = "Subaru";
        subaru.modelo = "Impreza";
        subaru.cilindrada = 2.0;
        subaru.color = "Blanco";
        System.out.println(subaru.detalle());

    }

}

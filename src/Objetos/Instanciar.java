package Objetos;

public class Instanciar {

    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru","Impreza");
        //subaru.setFabricante("Subaru");
        //subaru.setModelo("Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(ColorEnum.BLANCO);
        subaru.setTipo(TipoAutomovilEnum.HATCHBACK);
        
        //estático
        //Automovil.colorPatente = "fucsia";
        //Automovil.setColorPatente(Automovil.COLOR_ROJO);
        Automovil.setColorPatente(ColorEnum.ROJO);
        
        System.out.println(subaru.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println(subaru.acelerarFrenar(2000));
        System.out.println("Km x litro " + subaru.calcularConsumo(100,0.75f));
        subaru.setCapacidadTanque(50);
        System.out.println("Km x litro nueva capacidad tanque " + subaru.calcularConsumo(100,0.75f));
        System.out.println("Km x litro " + subaru.calcularConsumo(100,75));
        System.out.println("Imprime obj con método toString override " + subaru);

        Automovil subaru2 = new Automovil("Subaru","Impreza");
        //Nota: equals está sobreescrito para que compare fabricante y modelo
        System.out.println("Son iguales? " + subaru.equals(subaru2));
        
        Automovil subaru3 = new Automovil("Subaru","HJ 100");
        System.out.println("Son iguales 2 ? " + subaru.equals(subaru3));
        
        Automovil auto = new Automovil();
        System.out.println("Son iguales 3 ? " + subaru.equals(auto));
        
        TipoAutomovilEnum tipoSubaru = subaru.getTipo();
        switch(tipoSubaru) {
            case CONVERTIBLE:
                System.out.println("El automovil es deportivo, descapotable de dos puertas");
                break;
            case COUPE:
                System.out.println("El automovil es pequeño, deportivo de dos puertas");
                break;
            case HATCHBACK:
                System.out.println("El automovil es mediano, compacto y deportivo");
                break;
        }
    }

}

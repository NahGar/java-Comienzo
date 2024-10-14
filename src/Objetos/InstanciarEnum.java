package Objetos;

public class InstanciarEnum {

    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru","Impreza");
        //subaru.setCilindrada(2.0);
        Motor motor = new Motor(1.6,TipoMotorEnum.DIESEL);
        subaru.setMotor(motor);
        
        subaru.setColor(ColorEnum.BLANCO);
        subaru.setTipo(TipoAutomovilEnum.HATCHBACK);

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
        //switch mejorado (java 13)
        switch(tipoSubaru) {
            case CONVERTIBLE ->
                    System.out.println("El automovil es deportivo, descapotable de dos puertas");
            case COUPE ->
                    System.out.println("El automovil es pequeño, deportivo de dos puertas");
            case HATCHBACK ->
                    System.out.println("El automovil es mediano, compacto y deportivo");
        }

        TipoAutomovilEnum[] tipos = TipoAutomovilEnum.values();
        for(TipoAutomovilEnum tipo: tipos) {
            System.out.print(tipo+" "+tipo.getDescripcion()+" "+tipo.getNumeroPuertas() +"\n");
        }

    }

}

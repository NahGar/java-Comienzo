package Objetos;

public class InstanciarArreglo {

    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setMotor(new Motor(2.0,TipoMotorEnum.NAFTA));
        subaru.setColor(ColorEnum.BLANCO);
        subaru.setTipo(TipoAutomovilEnum.HATCHBACK);
        Automovil.setColorPatente(ColorEnum.ROJO);
        subaru.setTanque(new Tanque()); //usa default 
        subaru.setTanque(new Tanque(50));
        
        Automovil subaru2 = new Automovil("Subaru","Impreza");
        
        Automovil subaru3 = new Automovil("Subaru","HJ 100");
        
        Automovil auto = new Automovil();
        
        Automovil nissan = new Automovil("Nissan", "Navara", ColorEnum.ROJO);
        nissan.setMotor(new Motor(1.6, TipoMotorEnum.NAFTA));
        nissan.setTanque(new Tanque(45));
        nissan.setConductor(new Persona("Nahuel","García"));
        
        Automovil suzuki = new Automovil("Suzuki","Vitara");
        Automovil audi = new Automovil("Audi","A3");
        
        Automovil[] autos = new Automovil[5];
        autos[0] = subaru;
        autos[1] = subaru2;
        autos[2] = nissan;
        autos[3] = suzuki;
        autos[4] = audi;
    }

}

import javax.swing.*;

public class SistemasNumericos {

    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog( null, "Ingrese un número entero");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt( numeroStr );
        } catch (Exception e) {
            JOptionPane.showMessageDialog( null, "Debe ingresar un número entero");
            main( args );
            //el llamado a main hace que se ejecute todo de nuevo y aparecería 2 veces el
            //mensaje "Numero decimal ..." para evitarlo se puede usar return o System.exit(0)
            //return;
            System.exit(0);
        }

        System.out.println("Numero decimal = " + numeroDecimal);

    }
}

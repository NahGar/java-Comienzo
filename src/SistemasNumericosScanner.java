import java.util.Scanner;

public class SistemasNumericosScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        //String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        try {
            //numeroDecimal = Integer.parseInt( numeroStr );
            numeroDecimal = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Debe ingresar un número entero");
            main( args );
            //el llamado a main hace que se ejecute todo de nuevo y aparecería 2 veces el
            //mensaje "Numero decimal ..." para evitarlo se puede usar return o System.exit(0)
            //return;
            System.exit(0);
        }

        System.out.println("Numero decimal = " + numeroDecimal);

        String resultadoBinario = "número binario = " + Integer.toBinaryString(numeroDecimal);
        String resultadoOctal = "número octal = " + Integer.toOctalString(numeroDecimal);
        String resultadoHex = "número hexadecimal = " + Integer.toHexString(numeroDecimal);

        System.out.println(resultadoBinario + "\n" + resultadoOctal + "\n" + resultadoHex);
    }
}

import java.util.Scanner;

public class DetalleDeFactura {

    public static void main(String[] args) {

        /*
            Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura con espacios.
            Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales (,).
            Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%
         */

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingrese nombre de la factura o descripción:");
            String nombreFactura = scanner.nextLine();
            System.out.println("Ingrese un precio:");
            Double precio1 = scanner.nextDouble();
            System.out.println("Ingrese otro precio:");
            Double precio2 = scanner.nextDouble();

            double subtotal = precio1 + precio2;
            double impuestos = subtotal * 0.19;
            double total = subtotal + impuestos;

            String respuesta = "La factura " + nombreFactura + " tiene un total bruto de " + subtotal +
                   ", con un impuesto de " + impuestos + " y el monto después de impuesto es de " + total;
            System.out.println(respuesta);

        }
        catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

    }
}

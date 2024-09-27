import javax.swing.*;

public class TareaAreaCirculo {

    public static void main(String[] args) {

        try {
            String radioStr = JOptionPane.showInputDialog( null,
                    "Ingrese radio del círculo en centímeros");

            double radio = Double.parseDouble(radioStr);
            double area = Math.PI * Math.pow(radio,2);

            System.out.println("Área : " + area + " centímeros cuadrados");

        }
        catch (Exception e) {
            JOptionPane.showMessageDialog( null, "Error " + e.getMessage());

            System.exit(0);
        }
    }
}

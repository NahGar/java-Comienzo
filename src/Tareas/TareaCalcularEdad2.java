package Tareas;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TareaCalcularEdad2 {
    public static void main(String[] args) {

        try {
            String fechaNacimientoStr = JOptionPane.showInputDialog( null,
                    "Ingrese fecha de nacimiento dd/mm/aaaa");

            LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr,
                    DateTimeFormatter.ofPattern("[d/M/yyyy][dd/MM/yyyy]"));

            LocalDate ahora = LocalDate.now();

            Period periodo = Period.between(fechaNacimiento,ahora);
            System.out.println("Edad: " + periodo.getYears());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());

            System.exit(0);
        }

    }
}

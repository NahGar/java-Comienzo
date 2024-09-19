import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class TareaCalcularEdad {
    
    public static void main(String[] args) {
       
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            String fechaNacimientoStr = JOptionPane.showInputDialog( null, 
                    "Ingrese fecha de nacimiento yyyy-MM-dd");
        
            Date fechaNacimiento = format.parse(fechaNacimientoStr);
            Date now = new Date();
            
            long edadMilis = now.getTime() - fechaNacimiento.getTime();
            
            // Milisegundos en un año (aproximado)
            double milisegundosPorAnio = 31_557_600_000L; // 365.25 días en milisegundos
            
            double edad = edadMilis / milisegundosPorAnio;
            
            System.out.println("Su edad: " + edad + " años");
                        
            
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog( null, "Error " + e.getMessage());
            
            System.exit(0);
        }
        
    }
}

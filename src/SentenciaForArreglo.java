
import javax.swing.JOptionPane;


public class SentenciaForArreglo {

    public static void main(String[] args) {
        
        String[] nombres = {"Andres","Pepe","Maria","Beatriz","Carlos","Juan"};
        
        String nombre = JOptionPane.showInputDialog( null, "Ingrese parte del nombre");
        
        for( int i = 0; i < nombres.length; i++) {
            if( !nombres[i].toLowerCase().contains(nombre) ) {
                continue; //salta a la siguiente iteración
            }
            System.out.println(nombres[i]+" contiene " + nombre);
        }
    }
}

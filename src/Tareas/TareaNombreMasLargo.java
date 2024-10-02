package Tareas;

import javax.swing.JOptionPane;

public class TareaNombreMasLargo {

    public static void main(String[] args) {
        
        String nombre1, nombre2, nombre3, mensaje, nomApe1, nomApe2, nomApe3;
                
        try {
            nomApe1 = JOptionPane.showInputDialog( null, "Ingrese nombre1");
            nomApe2 = JOptionPane.showInputDialog( null, "Ingrese nombre2");
            nomApe3 = JOptionPane.showInputDialog( null, "Ingrese nombre3");
            
            nombre1 = nomApe1.split(" ")[0];
            nombre2 = nomApe2.split(" ")[0];
            nombre3 = nomApe3.split(" ")[0];
            
            mensaje = (nombre1.length() > nombre2.length()) ? "nombre1" : "nombre2";
                        
            if(mensaje == "nombre1") {
                mensaje = (nombre1.length() > nombre3.length()) ? nombre1 : nombre3;
            }
            else if(mensaje == "nombre2") {
                mensaje = (nombre2.length() > nombre3.length()) ? nombre2 : nombre3;
            }
            
            mensaje = mensaje + " tiene el nombre más largo";
            System.out.println(mensaje);
            
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog( null, "Error " + e.getMessage());
            
            System.exit(0);
        }
    }    
}

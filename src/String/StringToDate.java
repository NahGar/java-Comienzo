package String;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StringToDate {

    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        
        System.out.println("Ingrese fecha formato yyyy-MM-dd");
        try {
            Date fecha = format.parse(s.next());
            System.out.println("fecha " + fecha);
            System.out.println("format " + format.format(fecha));
            
        } catch (ParseException ex) {
            Logger.getLogger(StringToDate.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}

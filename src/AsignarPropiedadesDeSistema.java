import java.io.FileInputStream;
import java.util.Properties;

public class AsignarPropiedadesDeSistema {
    
    public static void main(String[] args) {
        
        try {
            //String dir = System.getProperty("user.dir");
            //System.out.println(dir);
            
            FileInputStream archivo = new FileInputStream("src/config.properties");
            
            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada", "Mi valor guardado");
            
            System.setProperties(p);
            //System.getProperties().list(System.out);
            Properties ps = System.getProperties();
            ps.list(System.out);
            
        }
        catch( Exception e ) {
            System.out.println("error al acceder al archivo de configuración " + e);
        }
    }
}

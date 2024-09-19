import java.util.Properties;

public class PropiedadesDeSistema {
    
    public static void main(String[] args) {
        
        String aux = System.getProperty("user.name");
        System.out.println("username:"+aux);
        aux = System.getProperty("user.home");
        System.out.println("userhome:"+aux);
        aux = System.getProperty("user.dir");
        System.out.println("userdir:"+aux);
        aux = System.getProperty("java.version");
        System.out.println("java version:"+aux);
        aux = System.getProperty("line.separator");
        System.out.println("lineseparator:"+aux+"sigue linea");
        
        Properties p = System.getProperties();
        p.list(System.out);
        
    }
}

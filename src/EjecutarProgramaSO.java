
public class EjecutarProgramaSO {
    
    public static void main(String[] args) {
        
        Runtime rt = Runtime.getRuntime();
        Process proceso;
        
        try {
            if( System.getProperty("os.name").startsWith("Windows") ) {
                proceso = rt.exec("notepad");
            }
            else if( System.getProperty("os.name").startsWith("Mac") ) {
                proceso = rt.exec("textedit");
            }
            else {
                proceso = rt.exec("gedit");
            }
            proceso.waitFor();
        }
        catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        System.out.println("Se ha cerrado el editor");
    }
}

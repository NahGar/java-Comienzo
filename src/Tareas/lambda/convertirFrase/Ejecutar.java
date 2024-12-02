package Tareas.lambda.convertirFrase;

public class Ejecutar {
    public static void main(String[] args) {
        
        ICvFrase reemplazar = frase -> {
            return frase.replace(" ", "").replace(".", "").replace(",", "").toUpperCase();
        };
        
        CvFrase cvFrase = new CvFrase();
        
        String frase = "Llega el sol, temprano. La oscuridad, mengua.";
        System.out.println(cvFrase.convertir(frase, reemplazar));
        
    }
}

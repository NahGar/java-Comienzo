package Tareas.lambda.convertirFrase;

public class CvFrase {
    public String convertir(String frase, ICvFrase lambda) {
        return lambda.convierte(frase);
    }
}

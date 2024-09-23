
public class MathRandom {
    
    public static void main(String[] args) {
        
        String[] colores = {"azul","amarillo","rojo","verde","blanco","negro"};
        
        double random = Math.random(); //0 a casi 1
        
        int randomRed = (int) Math.floor(random * colores.length);
        
        System.out.println("random " + random + " red " + randomRed + " " + colores[randomRed]);
        
    }
}

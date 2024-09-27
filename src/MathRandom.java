import java.util.Random;

public class MathRandom {
    
    public static void main(String[] args) {
        
        String[] colores = {"azul","amarillo","rojo","verde","blanco","negro"};
        
        double random = Math.random(); //0 a casi 1
        
        int randomRed = (int) Math.floor(random * colores.length);
        
        System.out.println("random " + random + " red " + randomRed + " " + colores[randomRed]);

        //Clase Random
        Random randomObj = new Random();

        int randomInt = randomObj.nextInt(7); //genera entre 0 y 6 (excluye 7)

        randomInt = 15 + randomObj.nextInt(25 - 15); //genera entre 15 y 24 (excluye 25)

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("random " + randomInt + " " + colores[randomInt]);
    }
}

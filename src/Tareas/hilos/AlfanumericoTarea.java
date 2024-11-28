package Tareas.hilos;

public class AlfanumericoTarea implements Runnable {

    private EnumTipo tipo;
    private static int[] numeros = {1,2,3,4,5,6,7,8,9};
    private static String[] letras = {"A","B","C","D","E","F","G","H","I","J","K","L",
        "M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    
    public AlfanumericoTarea(EnumTipo tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public void run() {

        switch (tipo) {
            case LETRA:
                for(int i=0; i<letras.length; i++) {
                    System.out.print(letras[i]+" ");
                }
                break;
            case NUMERO:
                for(int i=0; i<numeros.length; i++) {
                    System.out.print(numeros[i]+" ");
                }
                break;
        }
        System.out.println("");
    }
    
}

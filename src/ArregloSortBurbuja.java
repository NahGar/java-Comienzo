public class ArregloSortBurbuja {
    
    public static void sortBurbuja(Object[] arreglo) {
        
        for(int i = 0; i < arreglo.length - 1; i++) {
            
            for(int j = 0; j < arreglo.length-1-i; j++) {
                //cambia de posiciones cuando la posición j+1 es anterior a la j
                if( ((Comparable) arreglo[j+1]).compareTo(arreglo[j]) < 0 ) {
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        
        String[] productos = {"Kingston Pendrive 64GB","Samsung Galaxy",
                              "Disco duro SSD externo","Chromecast","Notebook Asus"};
        
        sortBurbuja(productos);
        
        for(int i = 0; i < productos.length; i++) {
            System.out.println("["+i+"] "+ productos[i]);
        }
        
        Integer[] numeros = new Integer[5]; //arreglo con 4 valores en cero

        numeros[0] = 0;
        numeros[1] = 4;
        numeros[2] = Integer.valueOf("2");
        numeros[3] = 9;
        numeros[4] = -3;
        
        sortBurbuja(numeros);
        
        for(int i = 0; i < numeros.length; i++) {
            System.out.println("["+i+"] "+ numeros[i]);
        }
    }
}

package org.ngarcia.arreglos;

import java.util.Scanner;

public class ArreglosDetectarOrden {
    
    public static void main(String[] args) {

        Integer[] a = new Integer[5];
        
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 5 números");
        for(int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        
        boolean asc = false;
        boolean desc = false;
        for(int i = 0; i < a.length - 1; i++) {
            if(a[i] > a[i+1]) {
                desc = true;
            }
            if(a[i] < a[i+1]) {
                asc = true;
            }
        }
        
        String msg = "";
        if(!asc && !desc) {
            msg = "El arreglo tiene todos los valores iguales";
        }
        else if(asc && desc) {
            msg = "El arreglo no está ordenado";
        }
        else if(asc) {
            msg = "El arreglo está ordenado ascendente";
        }
        else {
            msg = "El arreglo está ordenado descendente";
        }
        
        System.out.println(msg);
    }
}

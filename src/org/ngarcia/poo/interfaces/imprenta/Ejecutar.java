package org.ngarcia.poo.interfaces.imprenta;

import org.ngarcia.poo.interfaces.imprenta.modelo.*;

public class Ejecutar {
    
    public static void main(String[] args) {
        
        Curriculum cv = new Curriculum("Pepe Mujica", "Analista de sistemas", "Resumen, experiencia, etc");
        cv.addExperiencia("Java").addExperiencia("Angular").addExperiencia("Sql");
        
        Informe informe = new Informe("Martin C Martinez", "Acevedo Díaz", "Estudio de microservicios");
        
        imprimir(cv);
        imprimir(informe);
        
    }   
    
    public static void imprimir(Hoja imprimible) {
        System.out.println(imprimible.imprimir());
    }
}

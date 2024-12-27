package org.ngarcia.recursividad;

import org.ngarcia.recursividad.models.Componente;

import java.util.stream.Stream;

public class Ejecutar {

    public static void main(String[] args) {

        Componente pc = new Componente("gabinete pc atx");
        Componente fuente = new Componente("fuente 700w");
        Componente placaMadre = new Componente("mainboard asus sockets amd");
        Componente cpu = new Componente("cpu amd ryzen 5");
        Componente ventilador = new Componente("ventilador cpu");
        Componente disipador = new Componente("disipador");
        Componente tarjetaVideo = new Componente("nvidia rtx 2080 8gb");
        Componente gpu = new Componente("nvidia gpu rtx");
        Componente gpuRam = new Componente("4gb ram");
        Componente gpuRam2 = new Componente("4gb ram");
        Componente gpuVentiladores = new Componente("ventiladores");
        Componente ram = new Componente("Memoria ram 32gb");
        Componente ssd = new Componente("Disco ssd 2T");

        cpu.addComponente(ventilador).addComponente(disipador);
        tarjetaVideo.addComponente(gpu).addComponente(gpuRam).addComponente(gpuRam2)
                .addComponente(gpuVentiladores);
        placaMadre.addComponente(cpu).addComponente(tarjetaVideo).addComponente(ram)
                .addComponente(ssd);
        pc.addComponente(fuente).addComponente(placaMadre)
                .addComponente(new Componente("teclado"))
                .addComponente(new Componente("mouse"));

        //metodoRecursivo(pc, 0);
        metodoRecursivoJ8(pc, 0).forEach( c -> {
            System.out.println("\t".repeat(c.getNivel()) + c.getNombre());
        });
    }

    public static Stream<Componente> metodoRecursivoJ8(Componente c, int nivel) {
        c.setNivel(nivel);
        //concatena stream padre + hijos
        return Stream.concat(Stream.of(c),
                //llama metodo recursivo porque hijos podrian tener hijos
                c.getHijos().stream().flatMap( hijo -> metodoRecursivoJ8(hijo, nivel + 1)));
    }

    public static void metodoRecursivo(Componente c, int nivel) {
        System.out.println("\t".repeat(nivel) + c.getNombre());
        if(c.tieneHijos()) {
            for (Componente hijo: c.getHijos()) {
                metodoRecursivo(hijo, nivel + 1);
            }
        }
    }
}

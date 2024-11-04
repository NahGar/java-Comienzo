package org.ngarcia.pooClasesAbstractas.form;

import org.ngarcia.pooClasesAbstractas.form.elementos.*;
import org.ngarcia.pooClasesAbstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.ngarcia.pooClasesAbstractas.form.validador.*;

public class Ejecutar {

    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());
        
        InputForm password = new InputForm("clave","password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(6,12));
        
        InputForm email = new InputForm("email","email");
        email.addValidador(new RequeridoValidador())
             .addValidador(new EmailValidador());
        
        InputForm edad = new InputForm("edad","number");
        edad.addValidador(new NumeroValidador());

        TextareaForm experiencia = new TextareaForm("exp",5,9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());
        
        lenguaje.addOpcion(new Opcion("1","Java"))
        //.addOpcion(new Opcion("2","Python").setSelected(true))}
        //.addOpcion(new Opcion("2","Python").setSelected())
                .addOpcion(new Opcion("2","Python"))
        .addOpcion(new Opcion("3","C++"))
        .addOpcion(new Opcion("4","Javascript"))
        .addOpcion(new Opcion("5","PHP"));
        //lenguaje.setSelectedValor("2");


        //método abstracto
        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='" + this.nombre + "' value=\"" + this.valor + "\">";
            }
        };

        saludar.setValor("este campo está deshabiliado");

        username.setValor("");
        password.setValor("pass");
        email.setValor("abc123.com");
        edad.setValor("28L");
        experiencia.setValor("... lo que sea");

        //2 opciones para hacer lo mismo
        List<ElementoForm> elementos = Arrays.asList(username,password,email,edad,experiencia,lenguaje,saludar);
        //List<ElementoForm> elementos = new ArrayList<>();
        //elementos.add(username);
        //elementos.add(password);
        //elementos.add(email);
        //elementos.add(edad);
        //elementos.add(experiencia);
        //elementos.add(lenguaje);
        //elementos.add(saludar);

        System.out.println("-----------------------------------");
        /*
        for(ElementoForm e: elementos) {
            System.out.println(e.dibujarHtml());
            System.out.println("-----------------------------------");
        }
        */
        elementos.forEach( e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("-----------------------------------");
        });
        
        elementos.forEach( e -> {
            if(!e.esValido()) {
                e.getErrores().forEach( System.out::println );
                //e.getErrores().forEach( err -> 
                //    System.out.println(err) 
                //);
            }
        });
    }
}

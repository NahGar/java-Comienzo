package org.ngarcia.pooClasesAbstractas.form;

import org.ngarcia.pooClasesAbstractas.form.elementos.*;
import org.ngarcia.pooClasesAbstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejecutar {

    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave","password");
        InputForm email = new InputForm("email","email");
        InputForm edad = new InputForm("edad","number");

        TextareaForm experiencia = new TextareaForm("exp",5,9);

        SelectForm lenguaje = new SelectForm("lenguaje");

        lenguaje.addOpcion(new Opcion("1","Java"))
        //.addOpcion(new Opcion("2","Python").setSelected(true))}
        .addOpcion(new Opcion("2","Python").setSelected())
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

        username.setValor("John Doe");
        password.setValor("pass1234");
        email.setValor("abc@123.com");
        edad.setValor("28");
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
    }
}

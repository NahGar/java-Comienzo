package org.ngarcia.pooClasesAbstractas.form;

import org.ngarcia.pooClasesAbstractas.form.elementos.ElementoForm;
import org.ngarcia.pooClasesAbstractas.form.elementos.InputForm;
import org.ngarcia.pooClasesAbstractas.form.elementos.SelectForm;
import org.ngarcia.pooClasesAbstractas.form.elementos.TextareaForm;
import org.ngarcia.pooClasesAbstractas.form.elementos.select.Opcion;

public class Ejecutar {

    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave","password");
        InputForm email = new InputForm("email","email");
        InputForm edad = new InputForm("edad","number");

        TextareaForm experiencia = new TextareaForm("exp",5,9);

        SelectForm lenguaje = new SelectForm("lenguaje");

        lenguaje.addOpcion(new Opcion("1","Java"));
        lenguaje.addOpcion(new Opcion("2","Python"));
        lenguaje.addOpcion(new Opcion("3","C++"));
        lenguaje.addOpcion(new Opcion("4","Javascript"));
        lenguaje.addOpcion(new Opcion("5","PHP"));
        lenguaje.setSelectedValor("2");

        username.setValor("John Doe");
        password.setValor("pass1234");
        email.setValor("abc@123.com");

        System.out.println(username);

    }
}

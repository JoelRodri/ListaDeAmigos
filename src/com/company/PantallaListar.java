package com.company;

public class PantallaListar {
    void mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("CONTACTOS GUARDADOS");

        int a = 1;

        for (Nota nota : Main.db.selectContacto()) {
            System.out.print(a + ". ");
            System.out.print(nota.nombre + " ");
            System.out.println(nota.apellidos);

            a++;
        }
    }
}

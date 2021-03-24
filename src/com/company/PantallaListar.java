package com.company;

public class PantallaListar {
    void mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("CONTACTOS GUARDADOS");

        int a = 1;

        for (Nota nota : Main.listadeamigos.amigos) {
            System.out.print(a + ". ");
            System.out.print(nota.nombre + " ");
            System.out.println(nota.apellidos);

            a++;
        }
    }
}

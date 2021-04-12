package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MostarInfo {

    Scanner sc = new Scanner(System.in);

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

        System.out.println("NUMERO DEL CONTACTO QUE QUIERES MOSTRAR:");


        int amigoSeleccionado = sc.nextInt();

        int b = 0;

        for (Nota nota : Main.db.selectContacto()) {
            if (amigoSeleccionado == b + 1) {
                System.out.print("Nombre:    " + nota.nombre + " ");
                System.out.println(nota.apellidos);
                System.out.println("Telefono:  " + nota.telefono);
                System.out.println("Correo:    " + nota.correo);
                System.out.println("Discord:   " + nota.discord);
            }
            b++;
        }
    }
}

package com.company;
import java.io.*;

public class PantallaCrear {
    void mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("CREAR CONTACTO");

        System.out.println("NO AÑADIR ESPACIOS INNECESARIOS");

        System.out.println("Nombre:");
        String nombre = Main.sc.nextLine();

        System.out.println("Apellidos:");
        String apellidos = Main.sc.nextLine();

        System.out.println("Numero de telefono:");
        String telefono = Main.sc.nextLine();

        System.out.println("Correo electronico:");
        String correo = Main.sc.nextLine();

        System.out.println("Discord (nombre#0000):");
        String discord = Main.sc.nextLine();

        Main.db.insertContacto(nombre, apellidos, telefono, correo, discord);
    }
}

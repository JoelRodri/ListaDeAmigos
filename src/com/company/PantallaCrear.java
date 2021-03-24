package com.company;

public class PantallaCrear {
    void mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("CREAR CONTACTO");

        Nota nota = new Nota();

        System.out.println("NO AÑADIR ESPACIOS INNECESARIOS");

        System.out.println("Nombre:");
        nota.nombre = Main.sc.nextLine();

        System.out.println("Apellidos:");
        nota.apellidos = Main.sc.nextLine();

        System.out.println("Numero de telefono:");
        nota.telefono = Main.sc.nextLine();

        System.out.println("Correo electronico:");
        nota.correo = Main.sc.nextLine();

        System.out.println("Discord (nombre#0000):");
        nota.discord = Main.sc.nextLine();

        Main.listadeamigos.amigos.add(nota);
    }
}

package com.company;

public class MostarInfo {
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

        System.out.println("NUMERO DEL CONTACTO QUE QUIERES MOSTRAR:");
        int amigoSeleccionado = Main.sc.nextInt();

        int b = 0;

        for (Nota nota : Main.listadeamigos.amigos) {
            if (amigoSeleccionado == b+1){
                System.out.print("Nombre:    " + Main.listadeamigos.amigos.get(b).nombre + " ");
                System.out.println(Main.listadeamigos.amigos.get(b).apellidos);
                System.out.println("Telefono:  " + Main.listadeamigos.amigos.get(b).telefono);
                System.out.println("Correo:    " + Main.listadeamigos.amigos.get(b).correo);
                System.out.println("Discord:   " + Main.listadeamigos.amigos.get(b).discord);
            }
            b++;
        }
    }
}

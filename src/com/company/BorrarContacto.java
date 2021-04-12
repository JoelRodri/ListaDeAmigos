package com.company;
import java.util.ConcurrentModificationException;

/*
    TODAVIA NO FUNCIONA
    TODAVIA NO FUNCIONA
    TODAVIA NO FUNCIONA
    TODAVIA NO FUNCIONA
        */

public class BorrarContacto {
    public void mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("BORRAR CONTACTO");
        System.out.print("Nombre del contacto que quieres eliminar:");

        String nombreEliminado = Main.sc.nextLine();

        int a = 1;

        for (Nota nota : Main.db.selectContacto()) {

            if (nombreEliminado.equals(nota.nombre)){
                System.out.print(a + ". ");
                System.out.print(nota.nombre + " ");
                System.out.println(nota.apellidos);

            }
            a++;

        }

        System.out.println("Que contacto desea eliminar (numero)?");

        int numeroEliminado = Main.sc.nextInt();

        int b = 0;

        for (Nota nota : Main.db.selectContacto()) {
            if (numeroEliminado == b+1){
                System.out.print("Nombre:    " + nota.nombre + " ");
                System.out.println(nota.apellidos);
                System.out.println("Telefono:  " + nota.telefono);
                System.out.println("Correo:    " + nota.correo);
                System.out.println("Discord:   " + nota.discord);
            }
            b++;
        }


        System.out.println("Para confirmar que quiere borrar el contacto escriba los siguientes parametros:");
        System.out.println("Nombre:");
        String nombre = Main.sc.next();

        System.out.println("ESCRIBA '1'");
        int numeroBorrar = Main.sc.nextInt();
        Main.sc.nextLine();

        if (!nombre.equals("")){
            Main.db.deleteContacto(nombre);
            System.out.println("Contacto eliminado con exito");
        } else{
            System.out.println("Proceso cancelado.");
            return;
        }

    }
}

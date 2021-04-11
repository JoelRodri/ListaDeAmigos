package com.company;
import java.util.ConcurrentModificationException;


public class BorrarContacto {
    public void mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("BORRAR CONTACTO");
        System.out.print("Nombre del contacto que quieres eliminar:");

        String nombreEliminado = Main.sc.nextLine();

        int a = 1;

        for (Nota nota : Main.listadeamigos.amigos) {

            if (nombreEliminado.equals(nota.nombre)){
                System.out.print(a + ". ");
                System.out.print(nota.nombre + " ");
                System.out.println(nota.apellidos);

            }
            a++;

        }

        System.out.println("Que contacto desea eliminar?");

        int numeroEliminado = Main.sc.nextInt();

        int b = 0;

        for (Nota nota : Main.listadeamigos.amigos) {
            if (numeroEliminado == b+1){
                System.out.print("Nombre:    " + Main.listadeamigos.amigos.get(b).nombre + " ");
                System.out.println(Main.listadeamigos.amigos.get(b).apellidos);
                System.out.println("Telefono:  " + Main.listadeamigos.amigos.get(b).telefono);
                System.out.println("Correo:    " + Main.listadeamigos.amigos.get(b).correo);
                System.out.println("Discord:   " + Main.listadeamigos.amigos.get(b).discord);
            }
            b++;
        }


        System.out.println("Seguro que quieres eliminar este contacto (S=si / N=no)?");

        String confirm = Main.sc.next();
        Main.sc.nextLine();

        if (confirm.equals("S")){
            Main.listadeamigos.amigos.remove(numeroEliminado-1);
            System.out.println("Contacto eliminado con exito");
        } else{
            System.out.println("Proceso cancelado.");
            return;
        }

    }
}

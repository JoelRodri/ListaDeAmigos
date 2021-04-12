package com.company;

public class FormatearBase {
    public void mostrar() {
        System.out.println("¡CUIDADO! SI SIGUE CON ESTE PROCESO BORRARA TODA LA INFORMACION QUE TIENE GUARDADA, SEGURO QUE DESEA CONTINUAR?(1=si / 2=no)");
        int confirmacion = Main.sc.nextInt();
        Main.sc.nextLine();

        if (confirmacion==1){
            Main.db.deleteTables();
            System.out.println("BASE DE DATOS FORMATEADA, REINICIA ANTES DE SEGUIR USANDO.");
        } else {
            System.out.println("Proceso cancelado.");
        }
    }
}

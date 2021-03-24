package com.company;

public class Menu {
    String elegirOpcion(String[] opciones) {

        boolean seguirPidiendo = true;
        String opcion = "";

        while (seguirPidiendo) {
            for (int i = 0; i < opciones.length; i++) {
                System.out.println((i + 1) + ". " + opciones[i]);
            }

            System.out.println("\nOpcion:");

            opcion = Main.sc.nextLine();

            if (Integer.valueOf(opcion) > opciones.length) {
                Mensaje mensaje = new Mensaje();
                mensaje.mostrarError("No existe esa opción");
            } else {
                seguirPidiendo = false;
            }

        }
        return opcion;
    }
}

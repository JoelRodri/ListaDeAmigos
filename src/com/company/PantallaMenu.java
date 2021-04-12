package com.company;

import java.text.Format;

public class PantallaMenu {
    boolean mostrar(){
        Titulo titulo = new Titulo();
        titulo.mostrar("LISTA DE AMIGOS"); // titulo = "LISTA DE AMIGOS"

        Menu menu = new Menu();
        String[] opciones = {"Crear", "Listar", "Mostrar informacion de amigo", "Borrar contacto", "Salir", "Formatear"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            PantallaCrear pantallaCrear = new PantallaCrear();
            pantallaCrear.mostrar();
        } else if ("2".equals(opcion)) {
            PantallaListar pantallaListar = new PantallaListar();
            pantallaListar.mostrar();
        } else if ("3".equals(opcion)) {
            MostarInfo mostarInfo = new MostarInfo();
            mostarInfo.mostrar();
        } else if ("4".equals(opcion)){
            BorrarContacto borrarContacto = new BorrarContacto();
            borrarContacto.mostrar();
        } else if ("5".equals(opcion)) {
            return false;
        }else if ("6".equals(opcion)){
            FormatearBase foramatearBase = new FormatearBase();
            foramatearBase.mostrar();
        }
        return true;
    }
}

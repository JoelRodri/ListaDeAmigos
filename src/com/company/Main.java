package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static BaseDeDatos db = BaseDeDatos.get();
    static ListaDeAmigos listadeamigos = new ListaDeAmigos();
    public static void main(String[] args) {
        db.createTables();
        PantallaMenu pantallaMenu = new PantallaMenu();
        while (pantallaMenu.mostrar()) {};


    }
}

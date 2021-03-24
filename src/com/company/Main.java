package com.company;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ListaDeAmigos listadeamigos = new ListaDeAmigos();

    public static void main(String[] args) {

        PantallaMenu pantallaMenu = new PantallaMenu();
        while (pantallaMenu.mostrar()) {};

    }
}

package com.alex.curso.java.aula05.aula15;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um dia da Semana");

        int valor = scan.nextInt();

        switch (valor) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            default:
                System.out.println("Dia da semana não encontado");
                break;
        }

        scan.close();
    }
}

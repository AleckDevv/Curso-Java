package com.alex.curso.java.aula05.aula17;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;

        do {
            System.out.println("Digite uma nota entre 0 e 10");

            nota = scan.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Digite um valor válido");
            } else if (nota >= 0 && nota <= 10) {
                System.out.println("Digitou um valor válido");
            }

        } while (nota < 0 || nota > 10);

        System.out.println("Você digitou um valor válido " + nota);

        scan.close();

    }

}

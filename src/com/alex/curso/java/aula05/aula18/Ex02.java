package com.alex.curso.java.aula05.aula18;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;

        do {
            System.out.println("Digite uma nota entre 0 e 10");
            nota = scan.nextInt();

            if (nota >= 0 && nota <= 10) {
                System.out.println("Nota válida");
            } else {
                System.out.println("nota inválida");
                System.out.println("Digite novamente");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("Saindo do programa...");

        scan.close();

    }
}

package com.alex.curso.java.aula05.exerciciosAula13;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma nota");
        int nota1 = scan.nextInt();

        System.out.println("Digite outra nota");
        int nota2 = scan.nextInt();

        System.out.println("Digite outra nota");
        int nota3 = scan.nextInt();

        System.out.println("Digite outra nota");
        int nota4 = scan.nextInt();

        int media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média é: " + media);

        scan.close();
    }

}

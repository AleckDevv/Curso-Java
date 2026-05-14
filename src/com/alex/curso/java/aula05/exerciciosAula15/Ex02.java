package com.alex.curso.java.aula05.exerciciosAula15;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor positivo ou negativo");

        int valor = scan.nextInt();

        if (valor < 0) {
            System.out.println("É negativo");
        } else {
            System.out.println("É Positivo");
        }

        scan.close();
    }
}

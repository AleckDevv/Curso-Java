package com.alex.curso.java.aula05.exerciciosAula13;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor em metros");
        double metros = scan.nextDouble();

        double conversao = metros * 100;

        System.out.println("O valor: " + metros + " Em centimetros é: " + conversao);

        scan.close();
    }

}

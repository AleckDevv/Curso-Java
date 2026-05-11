package com.alex.curso.java.aula05.exerciciosAula13;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a altura de um lado do quadrado");
        double altura = scan.nextDouble();

        double area = Math.pow(altura, 2);

        System.out.println("A área é: " + area);

        scan.close();
    }

}

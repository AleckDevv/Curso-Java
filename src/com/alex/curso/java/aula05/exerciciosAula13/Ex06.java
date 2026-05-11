package com.alex.curso.java.aula05.exerciciosAula13;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o raio do circulo");
        double raio = scan.nextDouble();

        raio = Math.PI * Math.pow(raio, 2);

        System.out.println("A área é: " + raio);
        scan.close();
    }

}

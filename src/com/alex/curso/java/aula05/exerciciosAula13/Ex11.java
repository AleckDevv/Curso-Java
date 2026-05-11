package com.alex.curso.java.aula05.exerciciosAula13;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int inteiro1 = scan.nextInt();

        System.out.println("Digite outro número inteiro");
        int inteiro2 = scan.nextInt();

        System.out.println("Digite um número real");
        double numeroReal = scan.nextDouble();

        System.out.println(
                "O dobro do primeiro: " + (inteiro1 * 2) +
                        "com metade do segundo: " + (inteiro2 / 2) +
                        " = " + ((inteiro1 * 2) + (inteiro2 / 2)));

        System.out.println("A soma do triplo do primeiro com o número real é: " + ((inteiro1 * 3) + numeroReal));
        System.out.println("O terceiro elevado ao cubo: " + Math.pow(numeroReal, 3));

        scan.close();
    }

}

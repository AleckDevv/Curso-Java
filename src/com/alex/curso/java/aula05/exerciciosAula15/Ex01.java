package com.alex.curso.java.aula05.exerciciosAula15;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = scan.nextInt();

        System.out.println("Digite outro número: ");
        int num2 = scan.nextInt();

        int maiorValor = Math.max(num1, num2);

        System.out.println("O maior valor é:" + maiorValor);

        scan.close();
    }
}

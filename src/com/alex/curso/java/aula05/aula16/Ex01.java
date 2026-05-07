package com.alex.curso.java.aula05.aula16;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número positivo");
        numero = scan.nextInt();

        while (numero <= 0) {
            System.out.println("Inválido - Não pode número negativo ou zero");
            System.out.println("tente novamente");

            numero = scan.nextInt();
        }

        System.out.println("Aceito " + numero);
        scan.close();
    }

}

package com.alex.curso.java.aula05.aula12;

import java.util.Scanner;

public class LerDadosTeclado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nome = scan.nextLine();
        System.out.println("Você digitou: " + nome);

        System.out.println("Digite sua idade:");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade + "anos");

        System.out.println("Digite sua altura:");
        double altura = scan.nextDouble();
        System.out.println("Você tem de altura: " + altura);

        System.out.println("Digite o seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);
        scan.close();
    }
}

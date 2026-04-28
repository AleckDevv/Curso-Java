package com.alex.curso.java.aula05.labs;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu Primeiro nome:");
        String nome = scan.next();
        System.out.println("Você digitou: " + nome);

        System.out.println("Digite sua idade e se tem carro");
        int idade = scan.nextInt();
        boolean carro = scan.nextBoolean();
        System.out.println("Idade: " + idade + "Carro: " + carro);

        scan.close();
    }
}

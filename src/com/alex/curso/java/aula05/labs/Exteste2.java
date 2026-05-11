package com.alex.curso.java.aula05.labs;

import java.util.Scanner;

public class Exteste2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        // nome
        do {
            System.out.println("Digite o seu nome");

            nome = scan.next();

            if (nome.length() <= 3) {
                System.out.println("O nome deve ser maior que 3 caracteres");
            }
        } while (nome.length() > 3);

        // idade
        do {
            System.out.println("Digite sua idade");
            idade = scan.nextInt();

            if (idade < 0 || idade > 150) {
                System.out.println("Digite uma idade válida");
            }

        } while (idade < 0 || idade > 150);

        // salario

        do {
            System.out.println("Digite o seu salário");
            salario = scan.nextDouble();

            if (salario < 0) {
                System.out.println("O salário deve ser maior que 0");
            }
        } while (salario < 0);

        // sexo
        do {
            System.out.println("Digite o seu sexo");
            sexo = scan.next();

            if (sexo.equals("m") || sexo.equals("f")) {
                System.out.println("Digite um sexo válido");
            }
        } while (sexo.equals("m") || sexo.equals("f"));

        scan.close();
    }
}

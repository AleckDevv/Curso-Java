package com.alex.curso.java.aula05.labs;

import java.util.Scanner;

public class ExTeste {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        String senha;

        do {
            System.out.println("Digite seu nome");
            nome = scan.next();

            System.out.println("Digite sua senha");
            senha = scan.next();

            if (nome.equals(senha)) {
                System.out.println("Nome ou senha iguais! Não é permitido");
            }
        } while (nome.equals(senha));

        System.out.println("Cadastro Realizado com Sucesso");

        scan.close();
    }
}

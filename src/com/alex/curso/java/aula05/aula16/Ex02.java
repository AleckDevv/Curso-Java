package com.alex.curso.java.aula05.aula16;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n=== 📋 MENU PRINCIPAL ===");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Simular depósito");
            System.out.println("0 - Sair do sistema");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo atual: R$ 1.450,00");
            } else if (opcao == 2) {
                System.out.println("Deposito atualizado");
            } else if (opcao != 0) {
                System.out.println("opção inxistente");
            }
        } while (opcao != 0);

        System.out.println("👋 Sistema encerrado. Até logo!");

        scan.close();
    }

}

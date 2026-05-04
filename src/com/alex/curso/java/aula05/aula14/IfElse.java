package com.alex.curso.java.aula05.aula14;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade");

        int idade = scan.nextInt();

        if (idade >= 18) {
            System.out.println("É maior de idade");
        } else {
            System.out.println("É menor de idade");
        }

        int valorProduto = 50;

        if (valorProduto <= 50) {
            System.out.println("O valor está ok");
        } else if (valorProduto > 55 && valorProduto <= 70) {
            System.out.println("Ainda da para comprar");
        } else {
            System.out.println("Desculpe, está muito caro e não consigo comprar");
        }

        scan.close();
    }
}

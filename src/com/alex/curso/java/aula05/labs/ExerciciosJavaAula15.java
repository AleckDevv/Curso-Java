package com.alex.curso.java.aula05.labs;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciciosJavaAula15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
         * // Exercicio 1
         * System.out.println("Digite um número");
         * int num1 = scan.nextInt();
         * 
         * System.out.println("Digite outro número");
         * int num2 = scan.nextInt();
         * 
         * if (num1 > num2) {
         * System.out.println("Num1 é maior");
         * } else {
         * System.out.println("Num2 é maior");
         * }
         */

        /*
         * // Exercício 2
         * System.out.println("Digite um valor");
         * int valor = scan.nextInt();
         * 
         * if (valor >= 0) {
         * System.out.println("É positivo");
         * } else if (valor < 0) {
         * System.out.println("É negativo");
         * }
         */

        /*
         * // Exercício 3
         * System.out.println("Digite uma letra (M - Masculino) e  (F - Feminino)");
         * String letra = scan.next();
         * 
         * if (letra.equalsIgnoreCase("f")) {
         * System.out.println("É Feminino");
         * } else if (letra.equalsIgnoreCase("m")) {
         * System.out.println("Masculino");
         * }
         */

        /*
         * // Exercicio 4
         * System.out.println("Digite uma letra do alfabeto");
         * String letra = scan.next();
         * 
         * switch (letra) {
         * case "a":
         * case "e":
         * case "i":
         * case "o":
         * case "u":
         * System.out.println("É Vogal");
         * break;
         * default:
         * System.out.println("É consoante");
         * }
         */

        /*
         * // Exercício 5
         * System.out.println("Digite uma nota");
         * double nota1 = scan.nextDouble();
         * 
         * System.out.println("Digite outra nota");
         * double nota2 = scan.nextDouble();
         * 
         * double media = (nota1 + nota2) / 2;
         * 
         * if (media >= 7) {
         * System.out.println("Aprovado");
         * } else if (media < 7) {
         * System.out.println("Reprovado");
         * } else if (media == 10) {
         * System.out.println("Aprovado com Distinção");
         * }
         */

        /*
         * // Exercicio 6
         * System.out.println("Digite 3 números separados por espaço: ");
         * int num1 = scan.nextInt();
         * int num2 = scan.nextInt();
         * int num3 = scan.nextInt();
         * 
         * int maior;
         * 
         * if (num1 >= num2 && num1 >= num3) {
         * maior = num1;
         * } else if (num2 >= num1 && num2 >= num3) {
         * maior = num2;
         * } else {
         * maior = num3;
         * }
         * 
         * System.out.println("Maior: " + maior);
         * 
         * // outra forma:
         * int maiorDireto = Math.max(num1, Math.max(num2, num3));
         * System.out.println("Maior Direto: " + maiorDireto);
         */

        /*
         * // Exercício 7
         * System.out.println("Digite 3 número");
         * int num1 = scan.nextInt();
         * int num2 = scan.nextInt();
         * int num3 = scan.nextInt();
         * 
         * int maiorDireto = Math.max(num1, Math.max(num2, num3));
         * int menorDireto = Math.min(num1, Math.min(num2, num3));
         * 
         * System.out.println("Maior: " + maiorDireto);
         * System.out.println("Menor: " + menorDireto);
         */

        /*
         * // Exercício 8
         * System.out.println("Digite o preço de três produtos");
         * 
         * double produto1 = scan.nextDouble();
         * double produto2 = scan.nextDouble();
         * double produto3 = scan.nextDouble();
         * 
         * double menor = Math.min(produto1, Math.min(produto2, produto3));
         * System.out.println("Você deve comprar o produto: " + menor);
         */

        /*
         * // Exercício 9
         * int[] numeros = { 5, 4, 3, 2, 1 };
         * // Arrays.sort(numeros); se não tivessem ordenados
         * Arrays.sort(numeros);
         * 
         * for (int i = numeros.length - 1; i >= 0; i--) {
         * System.out.println(numeros[i] + "");
         * }
         */

        /*
         * System.out.println("Em que turno você estuda?");
         * System.out.println("Digite (M - Matutino) - (V - Vespertino) - (N - Noturno)"
         * );
         * 
         * String turno = scan.next();
         * 
         * switch (turno) {
         * case "m":
         * System.out.println("Bom dia");
         * break;
         * case "v":
         * System.out.println("Boa tarde");
         * break;
         * case "n":
         * System.out.println("Boa noite");
         * default:
         * System.out.println("Turno não encontrado");
         * break;
         * }
         */

        // Exercício 11
        System.out.println("Digite o seu salário");
        double salarioColaborador = scan.nextDouble();

        double reajuste1 = 0.20;
        double reajuste2 = 0.15;
        double reajuste3 = 0.10;
        double reajuste4 = 0.05;
        double salarioOriginal = salarioColaborador;
        double novoSalario;

        if (salarioColaborador < 280.00) {
            novoSalario = salarioOriginal + (salarioOriginal * reajuste1);
            System.out.println("Seu Salário era de R$: " + salarioColaborador + " e agora é de: R$ " + novoSalario);
        } else if (salarioColaborador >= 280.00 && salarioColaborador < 700.00) {
            novoSalario = salarioOriginal + (salarioOriginal * reajuste2);
            System.out.println("Seu Salário era de R$: " + salarioColaborador + " e agora é de: R$ " + novoSalario);
        } else if (salarioColaborador >= 700.00 && salarioColaborador < 15000.00) {
            novoSalario = salarioOriginal + (salarioOriginal * reajuste3);
            System.out.println("Seu Salário era de R$: " + salarioColaborador + " e agora é de: R$ " + novoSalario);
        } else if (salarioColaborador >= 1500.00) {
            novoSalario = salarioOriginal + (salarioOriginal * reajuste4);
            System.out.println("Seu Salário era de R$: " + salarioColaborador + " e agora é de: R$ " + novoSalario);
        } else {
            System.out.println("Base salaria não encontrada para o reajuste");
        }

            
        scan.close();
    }
}

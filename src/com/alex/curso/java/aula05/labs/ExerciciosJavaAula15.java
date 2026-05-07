package com.alex.curso.java.aula05.labs;

import java.util.Arrays;
import java.util.Scanner;

import javax.print.attribute.standard.Media;

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
         * 
         * // Exercício 2
         * System.out.println("Digite um valor");
         * int valor = scan.nextInt();
         * 
         * if (valor >= 0) {
         * System.out.println("É positivo");
         * } else if (valor < 0) {
         * System.out.println("É negativo");
         * }
         * 
         * // Exercício 3
         * System.out.println("Digite uma letra (M - Masculino) e  (F - Feminino)");
         * String letra = scan.next();
         * 
         * if (letra.equalsIgnoreCase("f")) {
         * System.out.println("É Feminino");
         * } else if (letra.equalsIgnoreCase("m")) {
         * System.out.println("Masculino");
         * }
         * 
         * // Exercicio 4
         * System.out.println("Digite uma letra do alfabeto");
         * String letra2 = scan.next();
         * 
         * switch (letra2) {
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
         * 
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
         * 
         * // Exercicio 6
         * System.out.println("Digite 3 números separados por espaço: ");
         * int num1Ex6 = scan.nextInt();
         * int num2Ex6 = scan.nextInt();
         * int num3Ex6 = scan.nextInt();
         * 
         * int maior;
         * 
         * if (num1Ex6 >= num2Ex6 && num1Ex6 >= num3Ex6) {
         * maior = num1Ex6;
         * } else if (num2Ex6 >= num1Ex6 && num2Ex6 >= num3Ex6) {
         * maior = num2Ex6;
         * } else {
         * maior = num3Ex6;
         * }
         * 
         * System.out.println("Maior: " + maior);
         * 
         * // outra forma:
         * int maiorDireto = Math.max(num1Ex6, Math.max(num2Ex6, num3Ex6));
         * System.out.println("Maior Direto: " + maiorDireto);
         * 
         * // Exercício 7
         * System.out.println("Digite 3 número");
         * int num1Ex7 = scan.nextInt();
         * int num2Ex7 = scan.nextInt();
         * int num3Ex7 = scan.nextInt();
         * 
         * int maiorDiretoEx7 = Math.max(num1Ex7, Math.max(num2Ex7, num3Ex7));
         * int menorDireto = Math.min(num1Ex7, Math.min(num2Ex7, num3Ex7));
         * 
         * System.out.println("Maior: " + maiorDiretoEx7);
         * System.out.println("Menor: " + menorDireto);
         * 
         * // Exercício 8
         * System.out.println("Digite o preço de três produtos");
         * 
         * double produto1 = scan.nextDouble();
         * double produto2 = scan.nextDouble();
         * double produto3 = scan.nextDouble();
         * 
         * double menor = Math.min(produto1, Math.min(produto2, produto3));
         * System.out.println("Você deve comprar o produto: " + menor);
         * 
         * // Exercício 9
         * int[] numeros = { 5, 4, 3, 2, 1 };
         * // Arrays.sort(numeros); se não tivessem ordenados
         * Arrays.sort(numeros);
         * 
         * for (int i = numeros.length - 1; i >= 0; i--) {
         * System.out.println(numeros[i] + "");
         * }
         * 
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
         * 
         * // Exercício 11
         * System.out.println("Digite o seu salário");
         * double salarioColaborador = scan.nextDouble();
         * 
         * double reajuste1 = 0.20;
         * double reajuste2 = 0.15;
         * double reajuste3 = 0.10;
         * double reajuste4 = 0.05;
         * double salarioOriginal = salarioColaborador;
         * double novoSalario;
         * 
         * if (salarioColaborador < 280.00) {
         * novoSalario = salarioOriginal + (salarioOriginal * reajuste1);
         * System.out.println("Seu Salário era de R$: " + salarioColaborador +
         * " e agora é de: R$ " + novoSalario);
         * 
         * } else if (salarioColaborador >= 280.00 && salarioColaborador < 700.00) {
         * novoSalario = salarioOriginal + (salarioOriginal * reajuste2);
         * System.out.println("Seu Salário era de R$: " + salarioColaborador +
         * " e agora é de: R$ " + novoSalario);
         * 
         * } else if (salarioColaborador >= 700.00 && salarioColaborador < 15000.00) {
         * novoSalario = salarioOriginal + (salarioOriginal * reajuste3);
         * System.out.println("Seu Salário era de R$: " + salarioColaborador +
         * " e agora é de: R$ " + novoSalario);
         * 
         * } else if (salarioColaborador >= 1500.00) {
         * novoSalario = salarioOriginal + (salarioOriginal * reajuste4);
         * System.out.println("Seu Salário era de R$: " + salarioColaborador +
         * " e agora é de: R$ " + novoSalario);
         * 
         * } else {
         * System.out.println("Base salaria não encontrada para o reajuste");
         * }
         */

        /*
         * // / Exercício 12
         * System.out.println("Digite o valor de horas trabalhadas");
         * double horasTrabalhadas = scan.nextDouble();
         * 
         * System.out.println("Digite o valor da sua hora");
         * double valorHora = scan.nextDouble();
         * 
         * double salarioBruto = valorHora * horasTrabalhadas;
         * 
         * double percentualIr = 0;
         * double salarioFinal;
         * 
         * if (salarioBruto <= 900) {
         * percentualIr = 0;
         * } else if (salarioBruto <= 1500) {
         * percentualIr = 0.05;
         * } else if (salarioBruto <= 2500) {
         * percentualIr = 0.10;
         * } else if (salarioBruto > 2500) {
         * percentualIr = 0.20;
         * }
         * 
         * double ir = salarioBruto * percentualIr;
         * double inss = salarioBruto * 0.10;
         * double fgts = salarioBruto * 0.11;
         * 
         * double totalDescontos = ir + inss;
         * salarioFinal = salarioBruto - totalDescontos;
         * 
         * System.out.println("Holerite");
         * System.out.printf("Salário Bruto:   R$%.2f%n", salarioBruto);
         * System.out.printf("(-) IR:   R$%.2f%n", ir);
         * System.out.printf("(-) INSS (10%%):   R$%.2f%n", inss);
         * System.out.printf("(-) FGTS (11%%):   R$%.2f%n", fgts);
         * System.out.printf("Total Descontos:   R$%.2f%n", totalDescontos);
         * System.out.printf("Salário Final:   R$%.2f%n", salarioFinal);
         */

        /*
         * // Exercício 13
         * System.out.println("Digite (1-7) para o dia da semana");
         * int numeroDaSemana = scan.nextInt();
         * 
         * switch (numeroDaSemana) {
         * case 1:
         * System.out.println("Segunda");
         * break;
         * case 2:
         * System.out.println("Terça");
         * break;
         * case 3:
         * System.out.println("Quarta");
         * break;
         * default:
         * System.out.println("Dia da semana inválido");
         * break;
         * }
         */

        /*
         * // Exercício 14
         * System.out.println("Digite a primeira nota");
         * double nota1 = scan.nextDouble();
         * 
         * System.out.println("Digite a segunda nota");
         * double nota2 = scan.nextDouble();
         * 
         * double media = (nota1 + nota2) / 2;
         * 
         * if (media >= 9 && media <= 10) {
         * System.out.println("A");
         * } else if (media >= 7.5 && media < 9) {
         * System.out.println("B");
         * } else if (media >= 6 && media < 7.5) {
         * System.out.println("C");
         * } else if (media >= 4 && media < 6) {
         * System.out.println("D");
         * } else if (media >= 0 && media <= 4) {
         * System.out.println("E");
         * }
         */

        /* // Exercício 15
        System.out.println("Digite os lados de um triângulo");
        int lado1 = scan.nextInt();
        int lado2 = scan.nextInt();
        int lado3 = scan.nextInt();

        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            System.out.println("É triângulo");
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("É Equilatero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("É Isósceles");
            } else {
                System.out.println("Triângulo escaleno");
            }
        } else {
            System.out.println("Não é um trinângulo");
        } */

        

        scan.close();
    }
}
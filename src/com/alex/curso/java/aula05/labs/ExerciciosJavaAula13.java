package com.alex.curso.java.aula05.labs;

import java.util.Scanner;

public class ExerciciosJavaAula13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
         * Exercício 1
         * System.out.println("Olá, mundo !");
         * 
         * System.out.println("Digite um número:");
         * int num1 = scan.nextInt();
         * System.out.println("O número digitado foi: " + num1);
         */

        /*
         * Exercício 2
         * System.out.println("Digite um número: ");
         * int num1 = scan.nextInt();
         * System.out.println("Digite outro número");
         * int num2 = scan.nextInt();
         * 
         * int soma = num1 + num2;
         * System.out.println("A soma é: " + soma);
         */

        /*
         * Exercício 3
         * System.out.println("Digite  uma nota:");
         * double nota1 = scan.nextDouble();
         * System.out.println("Digite a segunda nota:");
         * double nota2 = scan.nextDouble();
         * System.out.println("Digite a terceira nota");
         * double nota3 = scan.nextDouble();
         * System.out.println("Digite a quarta nota");
         * double nota4 = scan.nextDouble();
         * 
         * double media = (nota1 + nota2 + nota3 + nota4) / 4;
         * System.out.println("A média é: " + media);
         */

        /*
         * Exercício 4
         * double metros = 2.5;
         * double centimetros = metros * 100;
         * System.out.println("Conversão: Metros -> Centimentos");
         * System.out.println(metros + " metros = " + centimetros + " centimetros");
         */

        /*
         * Exercício 5
         * System.out.println("Digite o raio do circulo");
         * double raio = scan.nextDouble();
         * double area = Math.PI * Math.pow(raio, 2);
         * // System.out.println("A área do círculo é: " + area);
         * System.out.printf("Área %.2f%n", area); /* Formatação com duas casas decimais
         */

        /*
         * Exercício 6
         * System.out.println("Digite o valor de um lado do quadrado");
         * double lado = scan.nextDouble();
         * double area = lado * lado;
         * System.out.println("A área do quadrado é: " + area);
         * 
         * double dobro = area * 2;
         * System.out.println("O dobro da área é: " + dobro);
         */

        /*
         * Exercício 7
         * System.out.println("Quanto você ganha por hora?");
         * double ganhoHora = scan.nextDouble();
         * 
         * System.out.println("Quantas hora você trabalhou no mês?");
         * double horasTrabalhadas = scan.nextDouble();
         * 
         * double salarioDomes = ganhoHora * horasTrabalhadas;
         * System.out.printf("Seu salário do mês é: R$%.2f%n", salarioDomes);
         */

        /*
         * Exercício 8
         * System.out.println("Digite a temperatura em graus Farenheit:");
         * double temperatura = scan.nextDouble();
         * double celcius = (5 * (temperatura - 32) / 9);
         * System.out.println("A temperatura em graus Celcius é: " + celcius);
         */

        /*
         * Exercício 9
         * System.out.println("Digite a temperatura em graus Celcius");
         * double celcius = scan.nextDouble();
         * double farenheit = (celcius * 1.8) + 32;
         * System.out.println("A temperatura em graus Farenheit é: " + farenheit);
         */

        /*
         * Exercício 10
         * System.out.println("Digite um número inteiro:");
         * int num1 = scan.nextInt();
         * 
         * System.out.println("Digite outro número inteiro");
         * int num2 = scan.nextInt();
         * 
         * System.out.println("Digite um número real");
         * double num3 = scan.nextDouble();
         * 
         * System.out.println("O dobro do primeiro é: " + (num1 * 2));
         * System.out.println("A metadae do segundo é: " + (num2 / 2.0));
         * 
         * double soma = (num1 * 3) + num3;
         * System.out.println("A soma to triplo com o terceiro é: " + soma);
         * System.out.println("O terceiro elevado ao cubo é: " + Math.pow(num3, 3));
         */

        /*
         * Exercício 11
         * System.out.println("Digite sua altura:");
         * double altura = scan.nextDouble();
         * double pesoIdeal = (72.7 * altura) - 58;
         * System.out.println("Seu peso ideal seria: " + pesoIdeal);
         */

        /*
         * Exercício 12
         * System.out.println("Qual sua altura: ");
         * double altura = scan.nextDouble();
         * 
         * System.out.println("Qual o seu sexo: ");
         * String sexo = scan.next();
         * 
         * double pesoIdealHomens = (72.7 * altura) - 58;
         * double pesoIdealMulheres = (62.1 * altura) - 44.7;
         * 
         * if (sexo.equalsIgnoreCase("f")) {
         * System.out.println("Seu peso ideal é para mulheres é de: " +
         * pesoIdealMulheres);
         * } else if (sexo.equalsIgnoreCase("m")) {
         * System.err.println("Seu peso ideal para Homens é de: " + pesoIdealHomens);
         * }
         */

        System.out.println("Digite o peso da pescaria");
        double pesoPescado = scan.nextDouble();

        double pesoPermitido = 50;
        double valorMulta = 4;

        if (pesoPescado > pesoPermitido) {
            pesoPescado += valorMulta;
        }

        scan.close();
    }
}

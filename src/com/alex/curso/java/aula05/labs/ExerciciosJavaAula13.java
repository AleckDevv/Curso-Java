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

        /*
         * Exercício 13
         * System.out.println("Digite o peso da pescaria");
         * double pesoPescado = scan.nextDouble();
         * 
         * double pesoPermitido = 50;
         * double valorMultaPorKg = 4;
         * 
         * double execesso = 0;
         * double multa = 0;
         * 
         * if (pesoPescado > pesoPermitido) {
         * execesso = pesoPescado - pesoPermitido;
         * multa = execesso * valorMultaPorKg;
         * }
         * 
         * System.out.println("Execesso: " + execesso + "KG");
         * System.out.println("Multa: R$ " + multa);
         */

        /*
         * Exercício 14
         * System.out.println("Quanto você ganha por hora?");
         * double valorHora = scan.nextDouble();
         * 
         * System.out.println("Quantas horas você trabalhou no mês?");
         * double horasTrabalhadasMes = scan.nextDouble();
         * 
         * double impostoDeRenda = 11;
         * impostoDeRenda = impostoDeRenda / 100;
         * 
         * double inss = 8;
         * inss = inss / 100;
         * 
         * double sindicato = 5;
         * sindicato = sindicato / 100;
         * 
         * double salarioBruto = valorHora * horasTrabalhadasMes;
         * 
         * double descontIr = salarioBruto * impostoDeRenda;
         * double descontoInss = salarioBruto * inss;
         * double descontoSindicato = salarioBruto * sindicato;
         * 
         * double salarioLiquido = salarioBruto - descontIr - descontoInss -
         * descontoSindicato;
         * 
         * System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
         * System.out.printf("IR (11%%): R$ %.2f%n", descontIr);
         * System.out.printf("INSS (8%%): R$ %.2f%n", descontoInss);
         * System.out.printf("Sindicato (5%%): R$ %.2f%n", descontoSindicato);
         * System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);
         */

        // converter área em litros
        /*
         * litros = area / 6
         *
         * Aplicando folga
         * litros = litros * 1.1
         * 
         * Estratégia de arredontamento - usar o Math.ceil()
         */

        System.out.println("Digite o tamanho da área em m²:");
        double area = scan.nextDouble();

        // litros necessários com folga
        double litros = (area / 6) * 1.1;

        // constantes
        double capacidadeLata = 18;
        double precoLata = 80;
        double capacidadeGalao = 3.6;
        double precoGalao = 25;

        // cenário 1: Apenas latas
        int latas = (int) Math.ceil(litros / capacidadeLata);
        double custoLatas = latas * precoLata;

        // cenário 2: Apenas galões
        int galoes = (int) Math.ceil(litros / capacidadeGalao);
        double custoGaloes = galoes * precoGalao;

        // cenário 3: misturado
        int latasMistura = (int) Math.ceil(litros / capacidadeLata);
        double restante = litros - (latasMistura * capacidadeLata);
        int galoesMistura = (int) Math.ceil(restante / capacidadeLata);

        // caso especial
        double custoMistura = (latasMistura * precoLata) + (galoesMistura * precoGalao);
        double custoAlternativo = (latasMistura + 1) * precoLata;

        if (custoAlternativo < custoMistura) {
            latasMistura += 1;
            galoesMistura = 0;
            custoMistura = custoAlternativo;
        }

        // resultado
        System.err.printf("Apenas latas: %d unidades - R$ %.2f%n", latas, custoLatas);
        System.err.printf("Apenas galões: %d unidades - R$ %.2f%n", galoes, custoGaloes);
        System.err.printf("Misturado: %d latas e %d galoões - R$ %.2f%n", latasMistura, galoesMistura, custoMistura);

        scan.close();
    }
}

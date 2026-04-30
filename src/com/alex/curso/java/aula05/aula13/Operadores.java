package com.alex.curso.java.aula05.aula13;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        /*
         * Operadores Aritméticos:
         * + -> Adição
         * - -> Subtração
         * -> Multiplicação
         * / -> Divisão
         * % -> Resto da Divisão
         * ++ -> Incremento
         * -- -> Decremento
         */

        Scanner scanner = new Scanner(System.in);
        // Soma
        System.out.println("Digite dois números: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int soma = num1 + num2;
        System.out.println("A soma é: " + soma);

        // Subtração
        int subracao = num1 - num2;
        System.out.println("A subtração é: " + subracao);

        // Multiplicação
        int multiplicacao = num1 * num2;
        System.out.println("A multiplicação é: " + multiplicacao);

        // Divisão
        int divisao = num1 / num2;
        System.out.println("A divisão é: " + divisao);

        // Resto da divisão
        int restoDivisao = num1 % num2;
        System.out.println("O resto da divisão é: " + restoDivisao);
        scanner.close();

        // Incremento
        int incremento = 1;
        System.out.println("Antes do incremento: " + incremento);
        incremento++;
        System.out.println("Depois do incremento: " + incremento);

        // Decremento
        int decremento = 5;
        System.out.println("Antes de decremento: " + decremento);
        decremento--;
        System.out.println("Depois do decremento: " + decremento);

        /*
         * Operadores Relacionais: Retornam true ou false
         * == -> Igual
         * != -> Diferente
         * > -> Maior
         * < -> Menor
         * >= -> Maior ou Igual
         * <= -> Menor ou igual
         */

        int n1 = 1;
        int n2 = 2;
        boolean verificaco = n1 == n2;
        boolean verificaco2 = n1 != n2;
        boolean verificaco3 = n1 > n2;
        boolean verificaco4 = n1 < n2;
        boolean verificaco5 = n1 >= n2;
        boolean verificaco6 = n1 <= n2;

        System.out.println(verificaco);
        System.out.println(verificaco2);
        System.out.println(verificaco3);
        System.out.println(verificaco4);
        System.out.println(verificaco5);
        System.out.println(verificaco6);
        /*
         * Da mesma forma, pode fazer a comparação com os outros operadores
         */

        /*
         * Operadores Lógicos:
         * && -> and ambas as condições tem que ser verdadeiras para ser true, se não, é
         * false
         * || -> or basta apenas uma condição ser satisfeita para ser true
         * ^ -> xor (ou exclusivo) retorna verdadeiro se os valores comparados forem
         * diferentes um do outro
         * ! -> not (negação) inverte o valor. Se é true, passa a ser false, se é false,
         * passa a ser true
         */

        int valor1 = 1;
        int valor2 = 2;

        boolean resultado1 = (valor1 == valor1) && (valor2 == valor2);
        boolean resultado2 = (valor1 == valor1) || (valor2 == valor2);
        System.out.println("valor1 é 1 and valor2 é 2 - resultado: " + resultado1);
        System.out.println("valor1 é 1 or valor2 é 2 - resultado: " + resultado2);
    }
}

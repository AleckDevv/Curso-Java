package com.alex.curso.java.aula05.exerciciosAula13;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quanto você ganha por hora");
        double valorHora = scan.nextDouble();

        System.out.println("Quantas hora trabalhadas por mês");

        double horastrabalhadas = scan.nextDouble();

        double salario = valorHora * horastrabalhadas;

        System.out.println("Seu salário vai ser de: " + salario);

        scan.close();
    }

}

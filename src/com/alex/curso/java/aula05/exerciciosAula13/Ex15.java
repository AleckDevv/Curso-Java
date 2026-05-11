package com.alex.curso.java.aula05.exerciciosAula13;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quanto você ganha por hora");
        double valorHora = scan.nextDouble();

        System.out.println("Quantas hora trabalhadas por mês");

        double horastrabalhadas = scan.nextDouble();

        double salarioBruto = valorHora * horastrabalhadas;

        double ir = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;

        double salarioLiquido = salarioBruto - ir - inss - sindicato;

        System.out.printf("+ Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("- IR (11%%): R$ %.2f%n", ir);
        System.out.printf("- INSS (8%%): R$ %.2f%n", inss);
        System.out.printf("- Sindicato (5%%): R$ %.2f%n", sindicato);
        System.out.printf("= Salário Líquido: R$ %.2f%n", salarioLiquido);

        scan.close();
    }

}

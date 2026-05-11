package com.alex.curso.java.aula05.exerciciosAula13;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura");
        double altura = scan.nextDouble();

        double pesoIdealHomens = (72 * altura) - 58;
        double pesoIdealMulheres = (62.1 * altura) - 44.7;

        System.out.println("Seu peso ideal é de: " + pesoIdealHomens);
        System.out.println("Seu peso ideal é de: " + pesoIdealMulheres);

        scan.close();
    }

}

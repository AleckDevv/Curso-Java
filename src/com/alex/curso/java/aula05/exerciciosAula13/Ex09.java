package com.alex.curso.java.aula05.exerciciosAula13;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Farenheit");
        double farenheit = scan.nextDouble();

        double calcius = (5 * (farenheit - 32) / 9);

        System.out.println("A temperatura convertida é: " + calcius);

        scan.close();
    }

}

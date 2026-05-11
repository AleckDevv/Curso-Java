package com.alex.curso.java.aula05.exerciciosAula13;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Farenheit");
        double celcios = scan.nextDouble();

        double farenheit = ((celcios * 1.8) + 32);

        System.out.println("A temperatura convertida é: " + farenheit);

        scan.close();
    }

}

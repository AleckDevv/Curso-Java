package com.alex.curso.java.aula05.exerciciosAula15;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite F ou M");

        String sexo = scan.next();

        if (sexo.equalsIgnoreCase("F")) {
            System.out.println("É feminino");
        } else if (sexo.equalsIgnoreCase("M")) {
            System.out.println("É masculino");
        } else {
            System.out.println("Sexo inválido");
        }

        scan.close();
    }
}

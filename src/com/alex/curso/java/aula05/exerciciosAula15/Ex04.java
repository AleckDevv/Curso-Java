package com.alex.curso.java.aula05.exerciciosAula15;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma vogal ou consante");

        String letra = scan.next();

        switch (letra) {
            case "a":
                System.out.println("É vogal");
                break;
            case "e":
                System.out.println("É vogal");
                break;
            case "i":
                System.out.println("É vogal");
                break;
            case "o":
                System.out.println("É vogal");
                break;
            case "u":
                System.out.println("É vogal");
                break;
            default:
                System.out.println("É consoante");
                break;
        }

        scan.close();
    }
}

package com.alex.curso.java.aula05.exerciciosAula13;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de peixes pescada");

        double quantidadePermitda = 50;
        double valorPorQuilo = 4;

        double quantidadePescada = scan.nextDouble();

        double excesso = 0;
        double multa = 0;

        if (quantidadePescada > quantidadePermitda) {
            excesso = quantidadePescada - quantidadePermitda;
            multa = excesso * valorPorQuilo;
        }

        System.out.println("Excesso: " + excesso + "kg");
        System.out.println("Multa: R$" + multa);

        scan.close();
    }

}

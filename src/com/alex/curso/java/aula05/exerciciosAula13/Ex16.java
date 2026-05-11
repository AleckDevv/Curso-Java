package com.alex.curso.java.aula05.exerciciosAula13;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tamanho em metros quadrados da área que vai ser pintada");

        double areCliente = scan.nextDouble();

        double litrosNecessarios = areCliente / 3;
        double latasNecessarias = Math.ceil(litrosNecessarios / 18);

        double precoTotal = latasNecessarias * 80;

        System.out.println("Litros Necessários: " + litrosNecessarios);
        System.out.println("Latas Necessárias: " + latasNecessarias);
        System.out.println("Preço Total: R$ " + precoTotal);

        scan.close();
    }

}

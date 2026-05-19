package com.alex.curso.java.aula05.aula27;

public class Main {
    public static void main(String[] args) {
        ClassesMetodosParametros van = new ClassesMetodosParametros();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);


        van.exibirAutonomia();

        van.obterAutonomia();

        double qtdCombustivel = van.calcularCombustivel(10.5);
        System.out.println(qtdCombustivel);
    }
}

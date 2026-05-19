package com.alex.curso.java.aula05.aula27;

public class ClassesMetodosParametros {
    String marca;
    String modelo;
    double numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel);
    }

    double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado.");
        return capCombustivel * consumoCombustivel;
    }

    double calcularCombustivel(double km) {
        return km / consumoCombustivel;
    }
}

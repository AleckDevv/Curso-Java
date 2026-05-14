package com.alex.curso.java.aula05.aula26;

public class ClassesMetodosComRetorno {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia() {
        System.out.println("Marca do carro é: " + this.marca + " Modelo: " + this.modelo + " Número Passageiros: " + this.numPassageiros
                + " Capacidade de Combustivel: " + this.capCombustivel + " Consumo de combustivel: " + this.capCombustivel);
    }

    double obterAutonomia() {
        System.out.println("Método obeter autonomia foi chamado");
        return capCombustivel * consumoCombustivel;
    }
}

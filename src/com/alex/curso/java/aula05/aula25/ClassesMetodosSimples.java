package com.alex.curso.java.aula05.aula25;

public class ClassesMetodosSimples {
    /*
     * métodos dentro de classes tem acesso direto ao this da classe
     * de onde ela foi criada.
     * */
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia() {
        System.out.println("Marca do carro é: " + this.marca + " Modelo: " + this.modelo + " Número Passageiros: " + this.numPassageiros
                + " Capacidade de Combustivel: " + this.capCombustivel + " Consumo de combustivel: " + this.consumoCombustivel);
    }
}

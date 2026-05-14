package com.alex.curso.java.aula05.aula26;

public class MainClassesMetodosComRetorno {
    public static void main(String[] args) {
        ClassesMetodosComRetorno carro = new ClassesMetodosComRetorno();

        carro.marca = "Fiat";
        carro.modelo = "Ducato";
        carro.numPassageiros = 4;
        carro.capCombustivel = 100;
        carro.consumoCombustivel = 0.2;

        carro.exibirAutonomia();

        /*
         * Para usar um método que tem retorno
         * é preciso salvar o resultado desse retono em uma variável
         * do mesmo tipo*/
        double autonomia = carro.obterAutonomia();
        System.out.println(autonomia);
    }
}


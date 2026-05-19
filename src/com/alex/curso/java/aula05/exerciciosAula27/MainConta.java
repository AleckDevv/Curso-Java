package com.alex.curso.java.aula05.exerciciosAula27;

public class MainConta {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.exibirInfoConta();

        conta.realizarSaque(100);

        conta.consultarSaldo();

        conta.verificarChequeEspecial();

        conta.depositarValor(2000);

        conta.consultarSaldo();

        conta.verificarChequeEspecial();

    }
}

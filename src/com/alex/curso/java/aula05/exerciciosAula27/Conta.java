package com.alex.curso.java.aula05.exerciciosAula27;

public class Conta {
    int numeroConta = 212321421;
    double saldo = 3000;
    boolean statusEspecial = false;
    double limiteConta = 5600;

    void exibirInfoConta() {
        System.out.println("Número da conta: " + this.numeroConta);
        System.out.println("Saldo atual da conta: " + this.saldo);
        System.out.println("Statu da conta: " + this.statusEspecial);
        System.out.println("Limte da conta: " + this.limiteConta);
    }

    boolean realizarSaque(double valor) {
        if (valor <= 0) {
            System.out.println("O valor de saque é maior que o valor de saldo");
            return false;
        }

        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado com Sucesso");
            return true;
        } else if (this.statusEspecial && valor <= this.saldo + this.limiteConta) {
            this.saldo -= valor;
            System.out.println("Saque realizado usando cheque especial");
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }


    double depositarValor(double valor) {
        if (valor <= 0) {
            System.out.println("Não pode depositar valores negativos ou zero");
        } else {
            this.saldo += valor;
            System.out.println("Deposito relizado com Sucesso");
        }

        return this.saldo;
    }

    void consultarSaldo() {
        System.out.println("O saldo é de: " + this.saldo);
    }

    void verificarChequeEspecial() {
        if (this.saldo < 0) {
            System.out.println("Está usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }
    }
}

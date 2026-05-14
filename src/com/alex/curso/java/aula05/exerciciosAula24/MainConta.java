package com.alex.curso.java.aula05.exerciciosAula24;

public class MainConta {
    public static void main(String[] args) {
        Conta c = new Conta();
        System.out.println("Dona do conta: " + c.nomeConta + " Número da Conta: " + c.numeroConta
                + " Saldo da Conta: " + c.saldoConta + " Limte da Conta: " + c.limiteConta + " Status Conta: " + c.status);
    }
}

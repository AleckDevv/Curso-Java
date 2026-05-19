package com.alex.curso.java.aula05.exerciciosAula27;

public class Lampada {
    String marca;
    String modelo;
    double potencia;
    String tipoSoquete;

    void exibirCaracteristicas() {
        System.out.println("A marca é: " + this.marca);
        System.out.println("O modelo é: " + this.modelo);
        System.out.println("A potência é de: " + this.potencia);
        System.out.println("O tipo de soquete é: " + this.tipoSoquete);
    }

    void ligarLampada() {
        System.out.println("Lampada ligada");
    }

    void desligarLampada() {
        System.out.println("Lampada desligada");
    }
}

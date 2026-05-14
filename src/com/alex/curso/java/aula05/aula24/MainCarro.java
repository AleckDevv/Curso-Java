package com.alex.curso.java.aula05.aula24;

public class MainCarro {

    public static void main(String[] args) {
        Carro van = new Carro();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numeroPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println("Marca: " + van.marca);
        System.out.println("Modelo: " + van.modelo);
        System.out.println("Número de Passageiros: " + van.numeroPassageiros);
        System.out.println("Capacidade do Combustível: " + van.capCombustivel);
        System.out.println("Consumo de Combustível: " + van.consumoCombustivel);
    }
}


package com.alex.curso.java.aula05.aula25;

public class MainClassesMetodosSimples {
    public static void main(String[] args) {
        /* Instânciando a classes*/
        ClassesMetodosSimples classes = new ClassesMetodosSimples();

        /*Definindo os atributos da classes*/
        classes.modelo = "Fiat";
        classes.marca = "Volks";
        classes.numPassageiros = 4;
        classes.capCombustivel = 50.56;
        classes.consumoCombustivel = 26.7;

        /*Chamando o métod que exibe as informações na tela*/
        classes.exibirAutonomia();
    }
}

package com.alex.curso.java.aula05.exerciciosAula27;

public class Aluno {

    String nome;
    String matricula;
    String curso;
    String[] disciplinas = new String[3];
    double[][] notas = new double[3][4];

    void mostrarInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Curso: " + this.curso);
    }

    double calcularMedia(int indiceDisciplina) {
        double soma = 0;

        for (int i = 0; i < notas[indiceDisciplina].length; i++) {
            soma += notas[indiceDisciplina][i];
        }

        return soma / notas[indiceDisciplina].length;
    }

    boolean verificarAprovado(int indiceDisciplina) {
        double media = calcularMedia(indiceDisciplina);
        return media >= 7;
    }

}

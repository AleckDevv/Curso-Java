package com.alex.curso.java.aula05.exerciciosAula24;

public class MainLivro {
    public static void main(String[] args) {
        Livro l = new Livro();
        l.nome = "Prince da Percia";
        l.autor = "Desconhecido";
        l.valor = 20.56;

        System.out.println("Nome do livro: " + l.nome);
        System.out.println("Autor do livro: " + l.autor);
        System.out.println("Valor do livro: " + l.valor);
    }
}

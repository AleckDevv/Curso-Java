package com.alex.curso.java.aula05.aula21;

public interface ForEach {
    public static void main(String[] args) {

        int[] notas = { 10, 2, 3, 4 };

        for (int nota : notas) {
            System.out.println(nota);
        }
    }
}

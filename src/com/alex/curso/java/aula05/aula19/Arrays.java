package com.alex.curso.java.aula05.aula19;

public class Arrays {
    public static void main(String[] args) {
        String[] nomes = { "Alex", "Soares", "Lopes", "A"};

        for (String letra : nomes) {
            if (letra.length() > 2) {
                continue;
            }

            System.out.println("Exibindo: " + letra);
        }


        for(String nome : nomes) {
            System.out.println("nome: " + nome);
        }
    }

}

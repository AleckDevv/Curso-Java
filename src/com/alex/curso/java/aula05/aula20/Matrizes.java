package com.alex.curso.java.aula05.aula20;

public class Matrizes {
    public static void main(String[] args) {
        /*
         * Definindo manualmente os espaço da matriz
         * onde o primeiro valor, é a coluna
         * e o segundo valor é a linha
         * 
         * Para uma matriz, é necessário fazer a instância dela
         */
        double[][] notasAlunos = new double[3][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 8;
        notasAlunos[0][3] = 9.5;

        notasAlunos[1][0] = 8;
        notasAlunos[1][1] = 7;
        notasAlunos[1][2] = 9;
        notasAlunos[1][3] = 9;

        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 9;
        notasAlunos[2][2] = 10;
        notasAlunos[2][3] = 7;

        // System.out.println(notasAlunos[0][0]);

        for (int i = 0; i < notasAlunos.length; i++) {
            /* Primeiro for, percorre a linha */

            for (int j = 0; j < notasAlunos[i].length; j++) {
                /* Segundo for, percorre a coluna */
                System.out.println(notasAlunos[i][j] + "");
            }

            System.out.println();
        }

        System.out.println("Calculando a média");
        double soma;

        for (int i = 0; i < notasAlunos.length; i++) {
            /* Primeiro for, percorre a linha */
            soma = 0;
            for (int j = 0; j < notasAlunos[i].length; j++) {
                /* Segundo for, percorre a coluna */
                soma += notasAlunos[i][j];
            }

            System.out.println("Média do aluno: " + i + " é = " + (soma / 4));

            System.out.println();
        }

        // definindo uma matriz de uma vez
        String[][] alunos = { { "Alex", "Soares" }, { "Maria", "Paz" } };

        for (int i = 0; i < alunos.length; i++) {

            for (int j = 0; j < alunos[i].length; j++) {
                System.out.println(alunos[i][j]);
            }
        }

    }

}

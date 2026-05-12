package com.alex.curso.java.aula05.aula20;

public class Teste {
    public static void main(String[] args) {
        int[][] notasAlunos = new int[3][3];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 5;
        notasAlunos[0][2] = 6;

        notasAlunos[1][0] = 10;
        notasAlunos[1][1] = 5;
        notasAlunos[1][2] = 6;

        notasAlunos[2][0] = 10;
        notasAlunos[2][1] = 5;
        notasAlunos[2][2] = 6;

        for (int i = 0; i < notasAlunos.length; i++) {
            // primeiro for que percorre as linhas

            for (int j = 0; j < notasAlunos[i].length; j++) {
                // segundo for que percorre a coluna
                System.out.println(notasAlunos[i][j] + "");
            }

        }

        String[][] nomes = { { "Alex", "Soares" }, { "João", "Vitor" } };

        for (int i = 0; i < nomes.length; i++) {
            for (int j = 0; j < nomes[i].length; j++) {
                System.out.println(nomes[i][j]);
            }
        }
    }

}

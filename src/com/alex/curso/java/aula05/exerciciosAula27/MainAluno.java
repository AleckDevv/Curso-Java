package com.alex.curso.java.aula05.exerciciosAula27;

public class MainAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.nome = "Alex";
        aluno.matricula = "12345";
        aluno.curso = "Java";

        aluno.disciplinas[0] = "Matemática";
        aluno.disciplinas[1] = "Português";
        aluno.disciplinas[2] = "História";

        aluno.notas[0][0] = 8;
        aluno.notas[0][1] = 7;
        aluno.notas[0][2] = 9;
        aluno.notas[0][3] = 6;

        aluno.notas[1][0] = 5;
        aluno.notas[1][1] = 6;
        aluno.notas[1][2] = 7;
        aluno.notas[1][3] = 6;

        aluno.notas[2][0] = 10;
        aluno.notas[2][1] = 9;
        aluno.notas[2][2] = 8;
        aluno.notas[2][3] = 10;

        aluno.mostrarInfo();

        for (int i = 0; i < aluno.disciplinas.length; i++) {
            System.out.println("Disciplina: " + aluno.disciplinas[i]);

            for (int j = 0; j < aluno.notas[i].length; j++) {
                System.out.println("Nota " + (j + 1) + ": " + aluno.notas[i][j]);
            }

            double media = aluno.calcularMedia(i);
            System.out.println("Média: " + media);

            if (aluno.verificarAprovado(i)) {
                System.out.println("Aluno aprovado");
            } else {
                System.out.println("Aluno reprovado");
            }

            System.out.println();
        }
    }
}
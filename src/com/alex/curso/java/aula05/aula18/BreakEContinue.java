package com.alex.curso.java.aula05.aula18;

public class BreakEContinue {
    public static void main(String[] args) {

        int num = 10;
        int max = 40;

        for (int i = 0; i < num; i++) {
            if (i * i >= num) {
                break; /* O break encerra o loop ao final da execução */
            }

            System.out.println("O valor de i: " + i);
        }

        for (int i = num; i <= max; i++) {
            if (i % 7 == 0) {
                continue; /* o continue pula a execução atual do loop dependendo da expressão */
            }

            System.out.println("O valor de i é: " + i);
        }

    }

}

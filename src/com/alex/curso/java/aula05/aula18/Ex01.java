package com.alex.curso.java.aula05.aula18;

public class Ex01 {

    public static void main(String[] args) {
        int[] numeros = { 10, 25, 40, 60, 80, 10 };

        /*
         * Nesse exemplo, o loop vai procruar o primeiro número maior que 50 e
         * parar a execução quando encontrar
         */

        for (int numero : numeros) {
            if (numero > 50) {
                System.out.println("Primeiro número maior que 50: " + numero);
                break;
            }

            System.out.println("Verificando: " + numero);
        }
        System.out.println("Fim do programa");

        /*
         * Nesse outro exemplo, o loop vai ignorar os números negativos
         * Quando encontrar um número negativo, o continue pula para a
         * próxima execução
         */

        int[] numeros2 = { 10, -5, 20, -3, 30 };

        for (int numero : numeros2) {
            if (numero < 0) {
                continue;
            }
            System.out.println("Número positivo: " + numero);
        }
    }

}

package com.alex.curso.java.aula05.aula16;

public class LoopsWhile {
    public static void main(String[] args) {
        int i = 0;
        int max = 10;
        while (i < max) {
            i++;
            System.out.println(i);
            // break;
        }

        do {
            i++;
            System.out.println("Valor de i: " + i);
        } while (i < 15);

        /*
         * o do while -> primeiro ele faz a expressão e depois
         * que ele avalia
         */
    }
}

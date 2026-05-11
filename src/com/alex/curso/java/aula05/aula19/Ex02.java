package com.alex.curso.java.aula05.aula19;

public class Ex02 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            int resultado = b[i] = a[i] * 2;

            System.out.println(resultado);
        }

    }

}

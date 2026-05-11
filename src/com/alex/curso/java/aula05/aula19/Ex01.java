package com.alex.curso.java.aula05.aula19;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        System.out.println("Vetor A: " + Arrays.toString(a));
        System.out.println("Vetor B: " + Arrays.toString(b));

    }

}

package com.alex.curso.java.aula05.aula19;

public class Ex06 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int[] b = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        int[] c = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];

            System.err.println("C [" + i + "] = " + c[i]);
        }
    }

}

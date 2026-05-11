package com.alex.curso.java.aula05.aula19;

public class Ex09 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] b = { 11, 21, 13, 41, 51, 61, 71, 81, 91, 12 };

        float[] c = new float[a.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] / (float) b[i];

            System.out.println("C[" + i + "] = " + c[i]);
        }
    }

}

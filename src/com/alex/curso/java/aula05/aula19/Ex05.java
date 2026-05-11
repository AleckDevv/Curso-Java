package com.alex.curso.java.aula05.aula19;

public class Ex05 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] b = new int[a.length];

        
        for (int i = 0; i < a.length; i++) {
            int resultado = b[i] = a[i] * i;
            System.out.println(resultado);
        }

    }
}

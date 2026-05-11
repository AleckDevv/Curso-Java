package com.alex.curso.java.aula05.aula19;

public class Ex04 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

        double[] b = new double[a.length];

        for (int i = 0; i < a.length; i++) {
            double resultado = b[i] = Math.sqrt(a[i]);
            /* 
            O método Math sempre retorna double, 
            prestar atenção ao usar variável que tem o tipo int

            então, se vai usar Math, sempre bom já iniciar e instanciar a várial já como double
            */
            System.out.println(resultado);
        }
    }

}

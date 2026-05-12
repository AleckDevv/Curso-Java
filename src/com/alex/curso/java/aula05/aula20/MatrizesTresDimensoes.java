package com.alex.curso.java.aula05.aula20;

public class MatrizesTresDimensoes {
    public static void main(String[] args) {
        /*
         * para uma matriz de várias dimensões
         * a quantidade de colchetes deve ser igual
         * a quantidade de dimensões
         */
        /*
         * int[][][] matrizTridimensional = new int[3][3][3];
         * 
         * int soma = 0;
         * int somaPares = 0;
         * int somaImpares = 0;
         * 
         * for (int i = 0; i < matrizTridimensional.length; i++) {
         * for (int j = 0; j < matrizTridimensional[i].length; j++) {
         * for (int k = 0; k < matrizTridimensional[i][j].length; k++) {
         * soma += matrizTridimensional[i][j][k] = i + j + k;
         * 
         * if (matrizTridimensional[i][j][k] % 2 == 0) {
         * somaPares += matrizTridimensional[i][j][k];
         * } else {
         * somaImpares += matrizTridimensional[i][j][k];
         * }
         * }
         * }
         * }
         * 
         * System.out.println("Soma Total " + soma);
         * System.out.println("Soma Pares: " + somaPares);
         * System.out.println("Soma Impares: " + somaImpares);
         */

        // 3 andares, 2 apartamentos por andar e 3 cômodos por apartamentos
        // 3 andares, 2 apartamentos por andar e 3 cômodos por apartamento
        int[][][] predio = new int[3][2][3];

        for (int andar = 0; andar < predio.length; andar++) {
            System.out.println("Andar: " + (andar + 1));

            for (int apto = 0; apto < predio[andar].length; apto++) {
                System.out.print("Apto: " + (apto + 1) + ": ");

                for (int comodo = 0; comodo < predio[andar][apto].length; comodo++) {
                    System.out.print(predio[andar][apto][comodo] + " ");
                }

                System.out.println();
            }

            System.out.println();
        }
    }

}
